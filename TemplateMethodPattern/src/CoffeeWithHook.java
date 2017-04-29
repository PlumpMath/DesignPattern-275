import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by qusijun on 2017/4/28.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    public void addCondiments() {
        System.out.println("dropping coffee through filter");
    }

    @Override
    public void brew() {
        System.out.println("adding sugar and milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
        //return super.customerWantsCondiments();
    }

    public String getUserInput()
    {
        String answer = null;

        System.out.println("Would you like your coffee with sugar or milk?(y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            answer = in.readLine();
        }
        catch (IOException e)
        {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null)
            return "no";
        else
            return answer;
    }
}
