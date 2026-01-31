import java.util.*;
public class RectangleTest{
	public static double avgP(Rectangle[][] rectangles){
		double total = 0;
		for(int i = 0; i < rectangles.length; i++){
			for(int j = 0; j < rectangles[i].length; j++){
				total += rectangles[i][j].perimeter();
			}
	
		}
		return total/9.0;
	}
	
	public static Rectangle greatestArea(Rectangle[][] rectangles){
		Rectangle greatest = new Rectangle("small", 1.0, 1.0);
		for(int i = 0; i < rectangles.length; i++){
			for(int j = 0; j < rectangles[i].length; j++){
				if(rectangles[i][j].area() > greatest.area()){
					greatest = rectangles[i][j];
				}
			}
	
		}
		return greatest;
	}
	
	public static void main(String[] args){
		Rectangle one = new Rectangle("one", 2.0, 1.0);
		Rectangle two = new Rectangle("two", 6.0, 2.0);
		Rectangle three = new Rectangle("three", 3.0, 5.0);
		Rectangle four = new Rectangle("four", 7.0, 5.0);
		Rectangle five = new Rectangle("five", 2.0, 4.0);
		Rectangle six = new Rectangle("six", 8.0, 9.0);
		Rectangle seven = new Rectangle("seven", 6.0, 7.0);
		Rectangle eight = new Rectangle("eight", 10.0, 10.0);
		Rectangle nine = new Rectangle("nine", 8.0, 9.0);
		Rectangle[][] rectangles = {
			{one, two, three},
			{four, five, six},
			{seven, eight, nine}
		};
		System.out.println("Average Perimeter: " + avgP(rectangles));
		System.out.println("Rectanlge # with the Greatest Area: " + greatestArea(rectangles).getName());
	}
}
