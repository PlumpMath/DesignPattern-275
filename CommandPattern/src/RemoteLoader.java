/**
 * Created by qusijun on 2017/4/10.
 */
public class RemoteLoader {
    public static void main(String[] args)
    {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand =
                new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                 new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommands(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommands(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommands(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommands(3,garageDoorUp,garageDoorDown);
        remoteControl.setCommands(4,stereoOnWithCD,stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }
}
