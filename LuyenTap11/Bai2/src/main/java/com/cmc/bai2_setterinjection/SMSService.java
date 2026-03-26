package com.cmc.bai2_setterinjection;

public class SMSService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Gui SMS: " + message);
    }
}
