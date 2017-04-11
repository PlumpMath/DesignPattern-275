/**
 * Created by qusijun on 2017/4/10.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
