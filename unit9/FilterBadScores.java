import java.util.*;
public class FilterBadScores{
	public static ArrayList<Integer> filterBadScores(int[] scores){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int x : scores){
			if(x < 50){
				result.add(x);
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[] scores = {95, 22, 77, 88, 33};
		
		System.out.println("Scores: ");
		for(int x : scores){
			System.out.println(x + " ");
		}
		System.out.println("result: " + filterBadScores(scores));
	}

}
