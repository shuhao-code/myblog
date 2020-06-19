package com.star.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 留言实体类
 * @author shuhao
 * @date 2020/6/18 9:58
 */
@Data
public class Message {

    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;
    private Long parentMessageId;
    private Boolean adminMessage;

    //回复留言
    private List<Message> replyMessage = new ArrayList<>();
    private Message parentMessage;
    private String parentNickname;
}
