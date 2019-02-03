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
    ServerResponse<User> login(String username, String password);
}
