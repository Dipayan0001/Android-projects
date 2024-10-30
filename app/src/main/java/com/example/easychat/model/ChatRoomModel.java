package com.example.easychat.model;

import com.google.firebase.Timestamp;

import java.util.*;

public class ChatRoomModel {
    String ChatroomId,lastMessageSenderId,lastMessage;
    List<String> userIds;
    Timestamp lastMessageTimestamp;

    public ChatRoomModel() {
    }

    public ChatRoomModel(String chatroomId, List<String> userIds, Timestamp lastMessageTimestamp, String LastMessageId) {
        ChatroomId = chatroomId;
        this.lastMessageSenderId = LastMessageId;
        this.userIds = userIds;
        this.lastMessageTimestamp = lastMessageTimestamp;
    }


    public String getChatroomId() {
        return ChatroomId;
    }

    public void setChatroomId(String chatroomId) {
        ChatroomId = chatroomId;
    }

    public String getLastMessageSenderId() {
        return lastMessageSenderId;
    }

    public void setLastMessageSenderId(String lastMessageSenderId) {
        this.lastMessageSenderId = lastMessageSenderId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public Timestamp getLastMessageTimestamp() {
        return lastMessageTimestamp;
    }

    public void setLastMessageTimestamp(Timestamp lastMessageTimestamp) {
        this.lastMessageTimestamp = lastMessageTimestamp;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
