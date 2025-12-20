package CreationDesgin.factoryDesignPattern.FactoryMethod.Notifaction;

public class EmailNoti implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}
