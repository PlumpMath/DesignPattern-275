/**
 * Created by qusijun on 2017/4/7.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createViggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
