import java.util.*;
public class Rectangle{
	//constructor - constructing the object of the class
	
	//initating private member or basically a parameter/possible customization
	private String name;
	private double width;
	private double height;
	
	
	public Rectangle(String nameIn, double widthIn, double heightIn){
	//input of public constructor setting customization
	//public member function
		name = nameIn;
		width = widthIn;
		height = heightIn;
	}

   //a method/functions of returning smth of the object
    public String getName(){
        return name;
    }
    
    public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
    
    public double perimeter(){
		return 2*width + 2*height;
	}
	
	public double area(){
		return width*height;
	}

}
