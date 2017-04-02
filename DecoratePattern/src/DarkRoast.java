public class DarkRoast extends Beverage
{
    public DarkRoast(String size)
    {
        description = "Dark Roast Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        if ("tall".equals(size))
            return .99;
        else if ("grande".equals(size))
            return 1.99;
        else
            return 2.99;
    }

}