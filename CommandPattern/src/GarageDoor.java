/**
 * Created by qusijun on 2017/4/8.
 */
public class GarageDoor {
    String name;

    public GarageDoor(String name)
    {
        this.name = name;
    }

    public void up()
    {
        System.out.println(name + " Garage Door is Open");
    }

    public void down()
    {
        System.out.println(name + " Garage Door is Close");
    }
}
