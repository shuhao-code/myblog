package com.star.service;

import com.star.entity.FriendLink;

import java.util.List;

/**
 * 友情链接Service
 * @author shuhao
 * @date 2020/6/19 10:50
 */
public interface FriendLinkService {

    //查询友情链接列表
    List<FriendLink> listFriendLink();

    //新增友链
    int saveFriendLink(FriendLink friendLink);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //根据id删除友链
    void deleteFriendLink(Long id);
}
