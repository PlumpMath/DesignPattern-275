public class Mocha extends CondimentDecorator
{
    Beverage beverage;
    public Mocha(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        if ("tall".equals(beverage.getSize()))
            return .20 + beverage.cost();
        else if ("grande".equals(beverage.getSize()))
            return .70 + beverage.cost();
        else
            return 1.20 + beverage.cost();
    }

}