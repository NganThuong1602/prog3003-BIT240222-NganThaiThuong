package com.cmc.bai2_setterinjection;

public class Notification {

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        if (messageService == null) {
            System.out.println("Chua gan MessageService.");
            return;
        }
        messageService.sendMessage(message);
    }
}