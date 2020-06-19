package com.star.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description: 用户实体类
 * @Date: Created in 21:39 2020/5/26
 */
@Data
public class User {

    private Long id;
    private String nickname;
    private String username;
    private String password;
    private String email;

    //头像
    private String avatar;

    //类型  是否为管理员还是普通用户
    private Integer type;
    private Date createTime;
    private Date updateTime;
}
