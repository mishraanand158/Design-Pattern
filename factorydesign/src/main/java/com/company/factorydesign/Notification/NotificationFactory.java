package com.company.factorydesign.Notification;

public class NotificationFactory {
    public Notification createNofication(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH" :
                return  new PushNotification();
            default:
                throw  new IllegalArgumentException("Unknown channel "+ channel);
        }
    }
}
