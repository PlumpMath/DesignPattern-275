/**
 * Created by qusijun on 2017/4/8.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler()
    {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance()
    {
        if (chocolateBoiler == null)
            chocolateBoiler =  new ChocolateBoiler();
        return chocolateBoiler;
    }

    public void fill()
    {
        if (empty)
        {
            empty = false;
            boiled = false;
        }
    }

    public void drain()
    {
        if (!isEmpty() && isBoiled())
        {
            boiled = true;
        }
    }

    public boolean isEmpty()
    {
        return empty;
    }

    public boolean isBoiled()
    {
        return boiled;
    }

}
