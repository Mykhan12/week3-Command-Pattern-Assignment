package khan3;
public class Main {

    public static void main(String[] args) {


        LightBulb bulb = new LightBulb();
        LightOnCommand lightOnCommand = new LightOnCommand(bulb);
        LightOffCommand lightOffCommand = new LightOffCommand(bulb);
        GeneralSwitch generalSwitch=new GeneralSwitch(lightOnCommand,lightOffCommand);
        generalSwitch.switchOn();
        generalSwitch.switchOff();
        generalSwitch.undo();



    }
}