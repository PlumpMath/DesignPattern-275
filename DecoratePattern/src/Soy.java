public class Soy extends CondimentDecorator
{
    Beverage beverage;
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost()
    {
        if ("tall".equals(beverage.getSize()))
            return beverage.cost() + .15;
        else if("grande".equals(beverage.getSize()))
            return beverage.cost() + .65;
        else
            return beverage.cost() + 1.15;
    }

    @Override
    public String getDescription() {

        return beverage.getDescription() + ", Soy";
    }
}