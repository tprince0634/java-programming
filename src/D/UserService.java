package D;

interface  NotificationService{
    void send(String message);
}

class SMSService implements  NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS" + message);
    }
}
class EmailService implements  NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email" + message);
    }
}

public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyuser(String message){
        notificationService.send(message);
    }


    public static void main(String[] args) {
        NotificationService service1 = new SMSService();
        NotificationService service2 = new EmailService();

        UserService userService = new UserService(service1);
        userService.notifyuser("Hello");

    }
}
