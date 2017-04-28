/**
 * Created by qusijun on 2017/4/28.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("dropping coffee through filter");
    }

    @Override
    void brew() {
        System.out.println("adding sugar and milk");
    }
}
