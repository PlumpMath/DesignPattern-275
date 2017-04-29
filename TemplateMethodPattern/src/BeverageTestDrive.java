/**
 * Created by qusijun on 2017/4/29.
 */
public class BeverageTestDrive {
    public static void main(String[] args)
    {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("Making tea...\n");
        teaHook.prepareRecipe();

        System.out.println("Making coffee...\n");
        coffeeHook.prepareRecipe();
    }
}
