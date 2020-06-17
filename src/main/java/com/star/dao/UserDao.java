package com.star.dao;

import com.star.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author shuhao
 * @date 2020/6/17 23:03
 */
@Mapper
@Repository
public interface UserDao {

    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
