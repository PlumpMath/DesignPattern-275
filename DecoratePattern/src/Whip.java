public class Whip extends CondimentDecorator
{
    Beverage beverage;
    public Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        if ("tall".equals(beverage.getSize()))
            return beverage.cost() + .10;
        else if("grande".equals(beverage.getSize()))
            return beverage.cost() + .60;
        else
            return beverage.cost() + 1.10;
    }
}