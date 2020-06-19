package com.star.dao;

import com.star.entity.Type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类持久层接口
 * @author shuhao
 * @date 2020/6/18 10:18
 */
@Mapper
@Repository
public interface TypeMapper {

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
