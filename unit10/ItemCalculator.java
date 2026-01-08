import java.util.*;

public class ItemCalculator{
	public static void balloonNamePrice(ArrayList<Item>items){
		for(Item i : items){
			System.out.println(i.getName() + ": " + i.getPrice());
		}
	}
	
	public static float averagePrice(ArrayList<Item>items){
		float total = 0.0f;
		for(Item i : items){
			total += i.getPrice();
		}
		return total/items.size();
	}
	
	public static String expensivePrice(ArrayList<Item>items){
		String expensive = " ";
		float compare = -1.0f;
		for(Item i : items){
			if(i.getPrice() > compare){
				compare = i.getPrice();
				expensive = i.getName();
			}
		}
		return expensive;
	}
	
	public static void main(String[] args){
		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(new Item("Giraffe", 67.0f));
		items.add(new Item("Lion", 100.0f));
		items.add(new Item("Elephant", 1.5f));
        
        System.out.println("average price: " + averagePrice(items));
        System.out.println();
        
        System.out.println("most expensive: " + expensivePrice(items));
        System.out.println();
	}
   
 }
