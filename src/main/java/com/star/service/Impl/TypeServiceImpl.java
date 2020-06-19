package com.star.service.Impl;

import com.star.dao.TypeMapper;
import com.star.entity.Type;
import com.star.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 分类业务层实现
 * @author shuhao
 * @date 2020/6/18 14:36
 */
@Service
@Transactional
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public int saveType(Type type) {
        int row = typeMapper.saveType(type);
        return row;
    }

    @Override
    public Type getType(Long id) {
        Type type = typeMapper.getType(id);
        return type;
    }

    @Override
    public List<Type> getAllType() {
        List<Type> allType = typeMapper.getAllType();
        return allType;
    }

    @Override
    public Type getTypeByName(String name) {
        Type typeByName = typeMapper.getTypeByName(name);
        return typeByName;
    }

    @Override
    public int updateType(Type type) {
        int row = typeMapper.updateType(type);
        return row;
    }

    @Override
    public void deleteType(Long id) {
        typeMapper.deleteType(id);
    }
}
