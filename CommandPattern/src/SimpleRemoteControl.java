/**
 * Created by qusijun on 2017/4/8.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command slot)
    {
        this.slot = slot;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
