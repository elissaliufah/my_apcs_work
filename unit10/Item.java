import java.util.*;
public class Item{
	public Item(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	// public accessor functions
    public String getName() { return name;}
    public float getPrice() {return price;}

	// private variables
    private String name;
    private float price;

}
