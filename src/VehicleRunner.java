public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    Bicycle myBicycle = new Bicycle("CitiBike", 4, 4);
    System.out.println(myBicycle.getName()); // inherited method
    System.out.println(myBicycle.getWheels()); // inherited method
    System.out.println(myBicycle.getGearCount()); // method ONLY available on Bicycle objects
    myBicycle.move(50); // inherited method
    myBicycle.turn(45); // inherited method
    myBicycle.brake(0.75); // inherited method
    myBicycle.ringBell(); // method ONLY available on Bicycle objects

//    myVehicle.ringBell();                          //line 1
//    System.out.println(myVehicle.getGearCount());  //line 2
//    myCar.ringBell();                              //line 3
//    myBike.honk();                                 //line 4
//    myBike.lockDoors();                            //line 5

    Bus myBus = new Bus("Magic School Bus", 4, 30);
    System.out.println(myBus.getName()); // inherited method
    System.out.println(myBus.getWheels()); // inherited method
    System.out.println(myBus.getBusCapacity()); // method ONLY available on Bus objects
    myBus.move(50); // inherited method
    myBus.turn(45); // inherited method
    myBus.brake(0.75); // inherited method
    myBus.schoolStopSignPopsUp(); // method ONLY available on Bus objects
  }
}