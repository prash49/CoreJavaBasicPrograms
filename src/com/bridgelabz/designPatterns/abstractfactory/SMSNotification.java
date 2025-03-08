package com.bridgelabz.designPatterns.abstractfactory;

public class SMSNotification implements Notification {
    @Override
    public String send(String content, String recipient) {
// write the logic to sending sms notification
        return "sms sent with content";
    }
}
