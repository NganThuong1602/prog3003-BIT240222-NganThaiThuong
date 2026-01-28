package Chapter02;

public class Bai5 {

    public static void main(String[] args) {

        Notifier notifier = new Notifier();

        notifier.setMessageService(new EmailService());
        notifier.send("Hello Email");

        notifier.setMessageService(new SMSService());
        notifier.send("Hello SMS");
    }
}

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class Notifier {

    private MessageService messageService;

    public void setMessageService(MessageService service) {
        this.messageService = service;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}