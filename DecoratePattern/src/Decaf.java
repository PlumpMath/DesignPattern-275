public class Decaf extends Beverage
{
    public Decaf(String size)
    {
        description = "Decaf Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        if ("tall".equals(size))
            return 1.05;
        else if ("grande".equals(size))
            return 2.05;
        else
            return 3.05;
    }
}