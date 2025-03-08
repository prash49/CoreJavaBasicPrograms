package com.bridgelabz.designPatterns.abstractfactory;

public class SMSFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        // write a logic to return difernct type of notifation
        return new SMSNotification();
    }
}
