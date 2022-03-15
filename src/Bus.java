public class Bus extends Vehicle
{
    private int busCapacity;

    public Bus(String name, int wheels, int busCapacity)
    {
        super(name, wheels);
        this.busCapacity = busCapacity;
    }

    public int getBusCapacity()
    {
        return busCapacity;
    }

    public static void schoolStopSignPopsUp()
    {
        System.out.println("All cars behind stop! When the Stop sign is up, that means children are passing through.");
    }
}
