package com.star.queryvo;

import lombok.Data;

/**
 * 搜索博客管理列表
 * @author shuhao
 * @date 2020/6/18 22:15
 */
@Data
public class SearchBlog {

    private String title;
    private Long typeId;
}