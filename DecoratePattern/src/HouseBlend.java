public class HouseBlend extends Beverage
{
    public HouseBlend(String size)
    {
        description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        if ("tall".equals(size))
            return .89;
        else if ("grande".equals(size))
            return 1.89;
        else
            return 2.89;
    }
}