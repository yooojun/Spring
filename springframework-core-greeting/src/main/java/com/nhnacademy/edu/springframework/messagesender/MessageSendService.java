package com.nhnacademy.edu.springframework.messagesender;

import java.net.Socket;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService() {
        System.out.println("default");
    }

//    public MessageSendService(MessageSender messageSender) {
//        this.messageSender = messageSender;
//        System.out.println("args");
//    }

    public void setEmailMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
        System.out.println("injection");
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }

}
