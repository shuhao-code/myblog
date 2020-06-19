package com.star.service.Impl;

import com.star.dao.UserMapper;
import com.star.entity.User;
import com.star.service.UserService;
import com.star.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shuhao
 * @date 2020/6/17 23:08
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String username, String password) {
        User user = userMapper.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

    @Override
    public int registerUser(User user) {
        return userMapper.registerUser(user);
    }
}
