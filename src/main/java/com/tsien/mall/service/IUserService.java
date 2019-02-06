package com.tsien.mall.service;

import com.tsien.mall.common.ServerResponse;
import com.tsien.mall.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 19:41
 */

@Service
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
}
