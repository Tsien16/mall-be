package com.tsien.mall.service.impl;

import com.tsien.mall.common.Const;
import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.dao.UserMapper;
import com.tsien.mall.pojo.User;
import com.tsien.mall.service.IUserService;
import com.tsien.mall.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 19:43
 */

public class UserServiceImpl implements IUserService {

    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        //todo 密码登陆MD5
        String md5Password = MD5Util.md5encodeutf8(password);

        User user = userMapper.selectLogin(username, md5Password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登陆成功", user);

    }

    @Override
    public ServerResponse register(User user) {
        ServerResponse validResponse = this.checkValid(user.getUsername(), Const.USERNAME);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        validResponse = this.checkValid(user.getEmail(), Const.EMAIL);
        if (!validResponse.isSuccess()) {
            return validResponse;
        }
        user.setRole(Const.Role.ROLE_CUSTOMER);

        //MD5加密
        user.setPassword(MD5Util.md5encodeutf8(user.getPassword()));
        int resultCount = userMapper.insert(user);

        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");

    }

    @Override
    public ServerResponse<String> checkValid(String str, String type) {
        if (StringUtils.isNoneBlank(type)) {
            if (Const.USERNAME.equals(type)) {
                int resultCount = userMapper.checkUsername(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("用户已存在");
                }
            }
            if (Const.EMAIL.equals(type)) {
                int resultCount = userMapper.checkEmail(str);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("邮箱已存在");
                }
            }
        } else {
            return ServerResponse.createByErrorMessage("参数值错误");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }
}
