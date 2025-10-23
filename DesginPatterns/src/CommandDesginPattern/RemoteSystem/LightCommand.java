package CommandDesginPattern.RemoteSystem;

public class LightCommand implements Command {

    private light light;

    public LightCommand(light light) {
        this.light = light;
    }

    @Override
    public void execute() {
      light.on();
    }

    @Override
    public void undo() {
     light.off();
    }
}
