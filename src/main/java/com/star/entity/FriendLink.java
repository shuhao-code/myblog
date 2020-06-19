package com.star.entity;

import lombok.Data;

import java.util.Date;

/**
 * 友情链接实体类
 * @author shuhao
 * @date 2020/6/18 10:03
 */
@Data
public class FriendLink {

    private Long id;
    private String blogname;
    private String blogaddress;
    private String pictureaddress;
    private Date createTime;
}
