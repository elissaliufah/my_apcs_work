import java.util.*;
public class ReverseAll{
	public static ArrayList<String> reverseAll(String[] strings){
		ArrayList<String> result = new ArrayList<String>();
		for(String x : strings){
			String flip = " ";
			for(int i = x.length() - 1; i >= 0; i--){
				flip += x.charAt(i);
			}
			result.add(flip);
		}
		return result;
	}
	
	public static void main(String[] args){
		String[] strings = {"abcd", "xyz"};
		
		System.out.println("strings: ");
		for(String x : strings){
			System.out.println(x + " ");
		}
		System.out.println("result:" + reverseAll(strings));
	}

}
