/**
 * Created by qusijun on 2017/4/7.
 */
public class ChicagoPizzaIngredientPFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Veggies[] createViggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }
}
