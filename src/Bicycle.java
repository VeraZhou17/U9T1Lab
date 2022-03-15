public class Bicycle extends Vehicle
{
    // attributes
    private int gearCount;

    public Bicycle(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    // getter methods for instance variables
    public int getGearCount()
    {
        return gearCount;
    }

    // public methods (aka behaviors)
    public static void ringBell()
    {
        System.out.println("Ring ring! Coming through!");
    }
}
