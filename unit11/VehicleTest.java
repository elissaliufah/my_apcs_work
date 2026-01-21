import java.util.*;


public class VehicleTest{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.add(new Car()); 
		vehicles.add(new Motorcycle()); 
		vehicles.add(new Bicycle()); 
		vehicles.add(new Unicycle());       


        for (Vehicle v : vehicles)
        {
            System.out.println(v.name() + " " + 
                               v.wheelCount() + " " + 
                               v.isHumanPowered());
        }
    }
}
