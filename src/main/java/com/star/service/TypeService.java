package com.star.service;

import com.star.entity.Type;

import java.util.List;

/**
 * 分类业务层接口
 * @author shuhao
 * @date 2020/6/18 14:34
 */
public interface TypeService {

    //新增保存分类
    int saveType(Type type);

    //根据id查询分类
    Type getType(Long id);

    //查询所有分类
    List<Type> getAllType();

    //根据分类名称查询分类
    Type getTypeByName(String name);

    //修改编辑分类
    int updateType(Type type);

    //删除分类
    void deleteType(Long id);
}
