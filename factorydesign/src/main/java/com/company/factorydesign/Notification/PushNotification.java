package com.company.factorydesign.Notification;

public class PushNotification  implements  Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push Notification executed ");
    }
}
