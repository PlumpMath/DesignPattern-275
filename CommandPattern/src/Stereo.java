/**
 * Created by qusijun on 2017/4/10.
 */
public class Stereo {
    String name;
    //int volume;

    public Stereo(String name)
    {
        this.name = name;
    }

    public void on()
    {
        System.out.println(name + "stereo is on");
    }

    public void setCD()
    {
        System.out.println(name + "stereo is set for CD input");
    }

    public void setVolume(int volume)
    {
        System.out.println(name + "stereo volume set to " + volume);
    }

    public void off()
    {
        System.out.println(name + "stereo is off");
    }
}
