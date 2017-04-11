/**
 * Created by qusijun on 2017/4/8.
 */
public class RemoteControlTest {
    public static void main(String[] args)
    {
        SimpleRemoteControl remote =
                new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageDoorOpen =
                new GarageDoorOpenCommand(garageDoor);
        Light light = new Light("");
        LightOnCommand lighton = new LightOnCommand(light);

        remote.setCommand(lighton);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
