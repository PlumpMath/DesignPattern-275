import java.awt.*;

/**
 * Created by qusijun on 2017/4/28.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("stepping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lemon");
    }
}
