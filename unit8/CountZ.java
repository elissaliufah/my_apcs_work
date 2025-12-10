import java.util.*;
public class CountZ{
	public static int countZ(ArrayList<String>values){
		int total = 0;
		for(String x : values){
			if(x.substring(0,1).equals("z")){
				total += x.length();
			}else if(x.substring(0,1).equals("Z")){
				total += x.length();
			}
		}
		return total;
	}
	
	public static void testcountZ(ArrayList<String>values, int expected){
		int result = countZ(values);
		for(String x : values){
			System.out.println("Expected: " + expected + " Result: " + result);
		}
		
		if(result == expected){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	
	public static void main(String[] args){
		ArrayList<String>countZ1 = new ArrayList<String>();
	
		countZ1.add("Dr. Kessner");
		countZ1.add("Dr. Sands");
	
		testcountZ(countZ1, 0);
	
		ArrayList<String>countZ2 = new ArrayList<String>();
	
		countZ2.add("Zorro");
		countZ2.add("zero");
		countZ2.add("zippy");
	
		testcountZ(countZ2, 14);
	
	
	}


}
