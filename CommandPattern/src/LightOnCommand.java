/**
 * Created by qusijun on 2017/4/8.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
