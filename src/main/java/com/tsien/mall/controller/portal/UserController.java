package com.tsien.mall.controller.portal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 19:32
 */

@RestController
@RequestMapping("/user/")
public class UserController {

    /**
     * 用户登录
     *
     * @param username    用户名
     * @param password    用户密码
     * @param httpSession session
     * @return Object
     */

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public Object login(String username, String password, HttpSession httpSession) {
        return null;
    }
}
