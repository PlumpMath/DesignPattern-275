/**
 * Created by qusijun on 2017/4/14.
 */
public class HomeTheaterFacade  {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CDPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CDPlayer cd,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper,
                             Projector projector)
    {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
        this.projector = projector;
    }

    public void watchMovie(String movie)
    {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(String movie)
    {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop(movie);
        dvd.eject();
        dvd.off();

    }

}
