public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    private float temperatue;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperatue + "F degree and "+ humidity+ "% humidity" );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatue = temp;
        this.humidity = humidity;
        display();
    }
}