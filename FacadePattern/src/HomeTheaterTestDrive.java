/**
 * Created by qusijun on 2017/4/14.
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args)
    {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        Tuner tuner = new Tuner();
        CDPlayer cdPlayer = new CDPlayer();

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(amp,tuner,dvd,cdPlayer,lights,screen,popper,projector);

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie("Raiders of the Lost Ark");

    }
}
