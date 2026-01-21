import java.util.*;


public class VehicleStats{
    public static int totalWheels(ArrayList<Vehicle>vehicles){
		int total = 0;
		for(Vehicle v : vehicles){
			total += v.wheelCount();
		}
		return total;
	}
    
    public static ArrayList<Vehicle> isHuman(ArrayList<Vehicle>vehicles){
		ArrayList<Vehicle> isHuman = new ArrayList<Vehicle>();
		for(Vehicle v : vehicles){
			if(v.isHumanPowered() == true){
				isHuman.add(v);
			}
		}
		return isHuman;
    }

	public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

		vehicles.add(new Car()); 
		vehicles.add(new Motorcycle()); 
		vehicles.add(new Bicycle()); 
		vehicles.add(new Unicycle());       
		
		System.out.println("total wheels: " + totalWheels(vehicles));
		
		ArrayList<Vehicle> result = isHuman(vehicles);
		for(Vehicle r : result){
			System.out.println(r.name());
		}
    }
}



