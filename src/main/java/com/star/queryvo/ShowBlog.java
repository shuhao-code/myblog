package com.star.queryvo;

import lombok.Data;

import java.util.Date;

/**
 * @author shuhao
 * @date 2020/6/18 21:33
 */
@Data
public class ShowBlog {

    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean published;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;
}
