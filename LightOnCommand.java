package khan3;
public class LightOnCommand implements Command {

    private LightBulb lightBulb;

    public LightOnCommand(LightBulb lightBulb)
    {
        this.lightBulb=lightBulb;
    }

    @Override
    public void execute() {

        lightBulb.turnLightOn();
    }

    @Override
    public void undo() {
        lightBulb.turnLightOff();
    }
}
