package com.star.dao;

import com.star.entity.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 友情链接Dao
 * @author shuhao
 * @date 2020/6/19 10:20
 */
@Mapper
@Repository
public interface FriendLinkMapper {

    //查询友情链接列表
    List<FriendLink> listFriendLink();

    //新增友链
    int saveFriendLink(FriendLink friendLink);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //根据id查询友链
    FriendLink getFriendLinkById(Long id);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //根据id删除友链
    void deleteFriendLinkById(Long id);
}
