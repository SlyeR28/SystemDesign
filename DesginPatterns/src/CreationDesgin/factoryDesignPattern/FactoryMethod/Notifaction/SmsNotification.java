package CreationDesgin.factoryDesignPattern.FactoryMethod.Notifaction;

public class SmsNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Sending Sms Notification : " +message);
    }
}
