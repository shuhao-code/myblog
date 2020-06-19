package com.star.service.Impl;

import com.star.dao.FriendLinkMapper;
import com.star.entity.FriendLink;
import com.star.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author shuhao
 * @date 2020/6/19 10:51
 */
@Service
@Transactional
public class FriendLinkServiceImpl implements FriendLinkService {

    @Autowired
    private FriendLinkMapper friendLinkMapper;
    @Override
    public List<FriendLink> listFriendLink() {
        return friendLinkMapper.listFriendLink();
    }

    @Override
    public int saveFriendLink(FriendLink friendLink) {
        return friendLinkMapper.saveFriendLink(friendLink);
    }

    @Override
    public FriendLink getFriendLinkByBlogaddress(String blogaddress) {
        FriendLink friendLink = friendLinkMapper.getFriendLinkByBlogaddress(blogaddress);
        return friendLink;
    }

    @Override
    public FriendLink getFriendLink(Long id) {
        FriendLink friendLinkById = friendLinkMapper.getFriendLinkById(id);
        return friendLinkById;
    }

    @Override
    public int updateFriendLink(FriendLink friendLink) {
        int res = friendLinkMapper.updateFriendLink(friendLink);
        return res;
    }

    @Override
    public void deleteFriendLink(Long id) {

        friendLinkMapper.deleteFriendLinkById(id);
    }
}
