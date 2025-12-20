package CreationDesgin.factoryDesignPattern.FactoryMethod.Notifaction;

public class NotificationFactory {

    public static Notification createNotifaction(String type){
        switch (type.toLowerCase()){
            case "email" :
                return new EmailNoti();
            case "sms":
                return new SmsNotification();
            case "push" :
                return new PushNotification();
            default:
                System.out.println("invalid type of notification type" + type);
                return null;
        }
    }
}
