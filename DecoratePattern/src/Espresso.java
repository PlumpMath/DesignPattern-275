public class Espresso extends Beverage
{
    public Espresso(String size)
    {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        if ("tall".equals(size))
            return 1.99;
        else if ("grande".equals(size))
            return 2.99;
        else
            return 3.99;

    }
}