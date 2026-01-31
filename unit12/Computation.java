import java.util.*;
public class Computation{
	public static int smallest(int[][] integers){
		int x = 1;
		for(int i = 0; i < integers.length; i++){
			for(int j = 0; j < integers[i].length; j++){
				if(integers[i][j] < x){
					x = integers[i][j];
				}
			}
		}
		return x;
	}
	
	public static float sum(float[][] floats){
		float total = 0.0f;
		for(int i = 0; i < floats.length; i++){
			for(int j = 0; j < floats[i].length; j++){
				total += floats[i][j];
			}
		}
		return total;
	}
	
	public static int numberA(String[][] strings){
		int numberA = 0;
		for(int i = 0; i < strings.length; i++){
			for(int j = 0; j < strings[i].length; j++){
				if(strings[i][j].substring(0,1).equals("A")){
					numberA += 1;
				}
			}
		}
		return numberA;
	}

	public static void main(String[] args){
		int[][] integers = {
			{10, 67, 48},
			{11, 12, 13},
			{1, 0, 12}
		};
		
		System.out.println("Smallest value: " + smallest(integers));
		
		float[][] floats = {
			{0.0f, 2.2f},
			{3.8f, 0.0f}
		};
		
		System.out.println("Sum of all values: " + sum(floats));
		
		String[][] strings = {
			{"Apple", "yum"},
			{"sauce", "Amazing"},
			{"angry", "bird"}
			//should be only two because i'm only counting number of capital A's
		};
		
		System.out.println("Number of strings starting with A: " + numberA(strings));
	}
	
}
