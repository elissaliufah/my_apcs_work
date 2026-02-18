import java.util.*;

public class Shape{

	private String name;
	private int sides;
	
	
	public Shape(String nameIn, int sidesIn){
	//input of public constructor setting customization
	//public member function
		this.name = name;
		this.sides = sides;
	}

   //a method/functions of returning smth of the object
    public String getName(){
        return name;
    }
    
    public int getSides(){
		return sides;
	}

}
