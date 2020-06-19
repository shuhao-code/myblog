package com.star.entity;

import lombok.Data;

/**
 * 相册实体类
 * @author shuhao
 * @date 2020/6/18 10:10
 */
@Data
public class Picture {

    private Long id;
    private String picturename;
    private String picturetime;
    private String pictureaddress;
    private String picturedescription;
}
