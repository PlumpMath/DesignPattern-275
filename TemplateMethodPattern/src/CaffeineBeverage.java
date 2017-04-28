/**
 * Created by qusijun on 2017/4/28.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater()
    {
        System.out.println("boiling water");
    }

    void pourInCup()
    {
        System.out.println("pouring into cup");
    }
}

