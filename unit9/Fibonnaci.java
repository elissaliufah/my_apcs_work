import java.util.*;
public class Fibonnaci{
	public static ArrayList<Integer> fibonnaci(int n){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		int c = a + b;
		for(int i = 0; i <= n; i++){
			c = a + b;
			a = b;
			b = c;
			result.add(a);
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println("Result : " + fibonnaci(2));
	}
	
}
