import java.util.*;
public class AnimalCalculator{   
	public static void result(ArrayList<Animal>animals){
		for(Animal a : animals){
			System.out.println(a.name());
			System.out.println(a.legCount());
			System.out.println(a.furriness());
		}
    }
    
    public static int average(ArrayList<Animal>animals){
		int totalLegs = 0;
		for(Animal a : animals){
			totalLegs += a.legCount();
		}
		return totalLegs/animals.size();
    }
    
    public static Animal fewest(ArrayList<Animal>animals){
		Animal fewest = animals.get(0);
		for (int i = 0; i < animals.size(); i++) {
			if(animals.get(i).legCount() < fewest.legCount()){
				fewest = animals.get(i);
			}
		}
		return fewest;
    }
    
    public static void main(String[] args){
		ArrayList<Animal> animals = new ArrayList<Animal>();
		//Human human = new Human("human", 2, false);
		//Cat cat = new Cat("cat", 4, true);
		//Sponge sponge = new Sponge("sponge", 0, true);
		//Centipede centipede = new Centipede("centipede", 100, false);
		
		animals.add(new Human("human", 2, false));
		animals.add(new Cat("cat", 4, true));
		animals.add(new Sponge("sponge", 0, true));
		animals.add(new Centipede("centipede", 100, false));
      
		result(animals); 
		System.out.println("average legs: " + average(animals));
		System.out.println("fewest legs: " + fewest(animals).name());
    }
}
