/**
 * Created by qusijun on 2017/4/10.
 */
public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo)
    {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
