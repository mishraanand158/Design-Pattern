package com.company.factorydesign;

import com.company.factorydesign.Notification.Notification;
import com.company.factorydesign.Notification.NotificationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactorydesignApplication {

	public static void main(String[] args) {

		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification =notificationFactory.createNofication("SMS");
		notification.notifyUser();

		String str ="Anand";
		str.valueOf(1);

	//	SpringApplication.run(FactorydesignApplication.class, args);
	}

}
