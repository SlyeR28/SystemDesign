package CreationDesgin.factoryDesignPattern.FactoryMethod.Notifaction;

public class PushNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " +message);
    }
}
