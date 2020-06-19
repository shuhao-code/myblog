package com.star.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 分类实体类
 * @author shuhao
 * @date 2020/6/18 9:42
 */
@Data
public class Type {

    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
