package com.star.service;

import com.star.entity.User;

/**
 * @author shuhao
 * @date 2020/6/17 23:06
 */
public interface UserService {

    User checkUser(String username, String password);
}
