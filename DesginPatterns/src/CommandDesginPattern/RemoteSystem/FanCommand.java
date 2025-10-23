package CommandDesginPattern.RemoteSystem;

public class FanCommand  implements Command{

    private fan fan;

    public FanCommand(fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.isOn();
    }

    @Override
    public void undo() {
      fan.isOff();
    }
}
