package khan3;
public class LightOffCommand implements Command {

    private LightBulb lightBulb;

    public LightOffCommand(LightBulb lightBulb)
    {
        this.lightBulb=lightBulb;
    }


    @Override
    public void execute() {
        lightBulb.turnLightOff();
    }

    @Override
    public void undo() {
        lightBulb.turnLightOn();
    }
}
