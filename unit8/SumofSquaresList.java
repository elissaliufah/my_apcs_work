import java.util.*;

public class SumofSquaresList{
	public static double sumofSquares(ArrayList<Double>values){
		double total = 0;
		for(double x : values){
			total += x*x;
		}
		return total;
	
	}
	
	public static void testsumofSquares(ArrayList<Double>values, double expected){
		double result = sumofSquares(values);
		for(double x : values){
			System.out.println("Expected: " + expected + " Result: " + result);
		}
		
		if(result == expected){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	
	}
	
	public static void main(String[] args){
		ArrayList<Double>sumofSquares1 = new ArrayList<Double>();
		
		sumofSquares1.add(0.0);
		sumofSquares1.add(1.0);
		sumofSquares1.add(2.0);
		
		
		testsumofSquares(sumofSquares1, 5.0);
		
		ArrayList<Double>sumofSquares2 = new ArrayList<Double>();
		
		sumofSquares2.add(1.0);
		sumofSquares2.add(2.0);
		sumofSquares2.add(3.0);
		
		testsumofSquares(sumofSquares2, 14.0);
		
	
	}




}
