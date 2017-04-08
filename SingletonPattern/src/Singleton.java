/**
 * Created by qusijun on 2017/4/8.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance()
    {
        if (uniqueInstance == null)
            return new Singleton();
        else
            return uniqueInstance;
    }
}
