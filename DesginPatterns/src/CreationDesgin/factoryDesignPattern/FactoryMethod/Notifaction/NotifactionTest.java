package CreationDesgin.factoryDesignPattern.FactoryMethod.Notifaction;

public class NotifactionTest {
    public static void main(String[] args) {

        String type = "gsgsg";

       Notification notification = NotificationFactory.createNotifaction(type);

       if(notification != null){
           notification.send("Welcome to the System");
       }else{
           System.out.println("⚠ Could not send notification. Invalid type.");
       }

    }
}
