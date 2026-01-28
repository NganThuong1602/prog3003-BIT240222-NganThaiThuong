package Chapter02;

public class Bai2 {

    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("sms");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("email");
        n2.notifyUser();
    }
}

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class NotificationFactory {

    public static Notification createNotification(String channel) {
        switch (channel.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel");
        }
    }
}