package com.bridgelabz.designPatterns.abstractfactory;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        // write a logic to return difernct type of notifation
        return new EmailNotification();
    }
}
