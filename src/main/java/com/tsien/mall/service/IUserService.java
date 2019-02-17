package com.tsien.mall.service;

import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.pojo.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 19:41
 */


public interface IUserService {
    /**
     * 用户登陆
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户注册
     *
     * @param user 用户
     * @return 注册是否成功的消息
     */
    ServerResponse register(User user);

    /**
     * 检验用户名或者密码是否合法
     *
     * @param str  用户名/密码
     * @param type 类型
     * @return 对象
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 根据用户名查找问题
     *
     * @param username 用户名
     * @return ServerResponse
     */
    ServerResponse selectQuestion(String username);

    /**
     * 验证问题答案
     *
     * @param username 用户名
     * @param question 问题
     * @param answer   答案
     * @return 消息
     */
    ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 重置密码
     *
     * @param username    用户名
     * @param passwordNew 新密码
     * @param forgetToken Token
     * @return 修改结果
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 重置密码
     *
     * @param passwordOld 旧密码
     * @param passwordNew 新密码
     * @param user        用户实体
     * @return 是否更新成功
     */
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 更新用户信息
     *
     * @param user 用户实体
     * @return 用户
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return 用户实体
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 检查用户是否是管理员
     *
     * @param user 用户实体
     * @return 消息
     */
    ServerResponse checkAdminRole(User user);
}
