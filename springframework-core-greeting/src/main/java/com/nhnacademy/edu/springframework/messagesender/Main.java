package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User("dbdydwns@naver.com", "010-7120-6289");
        String msg = "qwerasd";
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
//            context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, msg);
//            System.out.println("---------");
//            context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, msg);
//            System.out.println("---------");
//            context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, msg);
//            System.out.println("---------");
//            context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, msg);

            context.getBean("messageSenderService",MessageSendService.class ).doSendMessage(user,msg);



        }
    }
}