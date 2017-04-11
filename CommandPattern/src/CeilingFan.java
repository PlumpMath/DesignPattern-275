/**
 * Created by qusijun on 2017/4/10.
 */
public class CeilingFan {
    String name;

    public CeilingFan(String name)
    {
        this.name = name;
    }

    public void on()
    {
        System.out.println(name + "ceiling fan is on high");
    }

    public void off()
    {
        System.out.println(name + "ceiling fan is off");
    }
}
