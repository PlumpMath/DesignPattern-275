public abstract class Beverage
{
    String description = "Unknown Beverage";

    //final int SMALL = 0;
    // final int MIDDLE = 1;
    // final int BIG = 2;

    String  size;

    public String getDescription()
    {
        return size + " " + description;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public abstract double cost();


}