package com.tsien.mall.common;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/2/4 0004 1:21
 */

public class Const {
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";


    public interface Role {
        //普通用户
        /**
         * ROLE_CUSTOMER = 0
         */
        int ROLE_CUSTOMER = 0;

        //管理员
        /**
         * ROLE_ADMIN = 1
         */
        int ROLE_ADMIN = 1;
    }
}
