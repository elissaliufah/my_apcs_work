import java.util.*;
 
public class ShapeCollectionTest{
	public static void main(String[] args){
		ShapeCollection test = new ShapeCollection();
		test.addShape("Square", 4);
        test.addShape("Triangle", 3);
		test.addShape("Pentagon", 5);
        test.addShape("Hexagon", 6);
        test.addShape("Heptagon", 7);

		System.out.println("Square Number of Sides" + test.numberSides("Square"));
		
		System.out.println("Average Sides: " + test.avgSides(test.shapes));
		
		System.out.println("Even Sides: " + test.even(test.shapes));
		
	}
}
    
