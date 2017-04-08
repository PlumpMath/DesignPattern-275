/**
 * Created by qusijun on 2017/4/7.
 */
public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientPFactory();
        Pizza pizza = null;

        if (type.equals("cheese"))
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if (type.equals("veggie"))
        {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if (type.equals("pepperoni"))
        {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}

