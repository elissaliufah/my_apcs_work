import java.util.*;

public class CountLuckyList{
	public static int countLuckyList(ArrayList<Integer>values){
		int total = 0;
		for(int x : values){
			if((x%7 == 0)||(x%10 == 7)){
				total += 1;
			}
		}
		return total;
	}
	
	public static void testCountLuckyList(ArrayList<Integer>values, int expected){
		int result = countLuckyList(values);
		for(int x : values){
			System.out.println("Expected: " + expected + " Result: " + result);
		}
		
		if(result == expected){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	
	}
	
	public static void main(String[] args){
		ArrayList<Integer>countLuckyList1 = new ArrayList<Integer>();
		
		countLuckyList1.add(2);
		countLuckyList1.add(7);
		countLuckyList1.add(2);
		
		testCountLuckyList(countLuckyList1,1);
			
		ArrayList<Integer>countLuckyList2 = new ArrayList<Integer>();

		
		countLuckyList2.add(1);
		countLuckyList2.add(7);
		countLuckyList2.add(37);
		
		testCountLuckyList(countLuckyList2,2);

    }


}
