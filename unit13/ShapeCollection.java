import java.util.*;

public class ShapeCollection{
	public ShapeCollection(){
        shapes = new ArrayList<Shape>();
    }
     
    public void addShape(String name, int sides){
        shapes.add(new Shape(name, sides));
    }

	public int numberSides(String name){
		int numberSides = 0;
        for (Shape s : shapes){
            if(s.getName().equals(name)){
				numberSides += s.getSides();
            }
        }
		return numberSides;
	}
	
	public int avgSides(ArrayList<Shape> shapes){
        int total = 0;
        for (Shape s : shapes){
            total += s.getSides();
        }
        return total / shapes.size();
    }
    
    public ArrayList<Shape> even(ArrayList<Shape> shapes){
		ArrayList<Shape> evenShapes = new ArrayList<Shape> ();
		for (Shape s : shapes){
			if(s.getSides()%2 == 0){
				evenShapes.add(s);
			}
		}
		return evenShapes;
    }
    public ArrayList<Shape> shapes;
    
   
    
} 
