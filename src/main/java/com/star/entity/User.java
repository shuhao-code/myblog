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
    private String avatar;
    private Integer type;
    private Date createTime;
    private Date updateTime;
}
