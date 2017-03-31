import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable
{
    private float tempture;
    private float humidity;
    private float pressure;

    public WeatherData()
    {}

    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float tempture, float humidity, float pressure)
    {
        this.tempture = tempture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTempture()
    {
        return tempture;
    }

    public float getHumidity()
    {
        return humidity;
    }

    public float getPressure()
    {
        return pressure;
    }
}