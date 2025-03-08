package com.bridgelabz.designPatterns.abstractfactory;

public class EmailNotification implements Notification {
    @Override
    public String send(String content, String recipient) {
// write the logic to sending sms notification
        return "email sent with content";
    }
}
