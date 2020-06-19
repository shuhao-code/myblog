package com.star.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 评论实体类
 * @author shuhao
 * @date 2020/6/18 9:47
 */
@Data
public class Comment {

    private Long id;
    private String nickname;
    private String email;
    private String avatar;
    private String content;
    private Date createTime;
    private Long biogId;
    private Long parentCommentId;
    private Boolean adminComment;

    //回复评论
    private List<Comment> replyComments = new ArrayList<>();
    private Comment parentComment;
    private String parentNickname;
}
