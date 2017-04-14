/**
 * Created by qusijun on 2017/4/14.
 */
public class DvdPlayer {
    public void on()
    {
        System.out.println("Top-O-Line DVD player on");
    }

    public void play(String movie)
    {
        System.out.println("Top-O-Line DVD player playing " + movie);
    }

    public void stop(String movie)
    {
        System.out.println("Top-O-Line DVD player stopped " + movie) ;
    }

    public void eject()
    {
        System.out.println("Top-O-Line DVD player eject");
    }

    public void off()
    {
        System.out.println("Top-O-Line DVD player off");
    }
}
