package CommandDesginPattern.RemoteSystem;

public class Tesitng {
    public static void main(String[] args) {
        light livingRoomLight = new light();
        fan cellingFan = new fan();

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0 , new LightCommand(livingRoomLight));
        remoteController.setCommand(1, new FanCommand(cellingFan));

        System.out.println("---toggle light button 0---");
        remoteController.pressButton(0);
        remoteController.pressButton(0);

        System.out.println("-----toggle Fan button 0------");
        remoteController.pressButton(1);
        remoteController.pressButton(1);

        System.out.println("----pressing unsigned buttonn---");
        remoteController.pressButton(2);
    }


}
