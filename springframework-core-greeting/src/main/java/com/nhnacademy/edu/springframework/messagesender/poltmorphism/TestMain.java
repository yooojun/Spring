//package com.nhnacademy.edu.springframework.messagesender.poltmorphism;
//
//import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
//import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
//import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
//import com.nhnacademy.edu.springframework.messagesender.User;
//
//public class TestMain {
//    public static void main(String[] args) {
//        User user = new User("dbdydwns@naver.com", "010-7120-6289");
//        String msg = "qwerasd";
//        new MessageSendService(new SmsMessageSender())
//                .doSendMessage(user, msg);
//        new MessageSendService(new EmailMessageSender())
//                .doSendMessage(user, msg);
//    }
//}
