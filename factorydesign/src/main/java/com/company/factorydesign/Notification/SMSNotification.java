package com.company.factorydesign.Notification;

public class SMSNotification implements  Notification{

    @Override
    public void notifyUser() {
                System.out.println(" SMS Notification executed");
    }
}
