package com.cmc.bai2_setterinjection;

public class Bai2_SetterInjection {

    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.send("Xin chao qua Email");

        notification.setMessageService(new SMSService());
        notification.send("Xin chao qua SMS");
    }
}

