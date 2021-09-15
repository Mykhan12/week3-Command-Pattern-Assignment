package khan3;
public class GeneralSwitch {
    private Command onCommand;
    private Command offCommand;
    private Command lastCommand;

    public GeneralSwitch(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void switchOn() {
        onCommand.execute();
        lastCommand = onCommand;
    }

    public void switchOff() {
        offCommand.execute();
        lastCommand = offCommand;
    }

    public void undo() {
        lastCommand.undo();
    }

}
