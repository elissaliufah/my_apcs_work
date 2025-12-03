public class CountLucky{
	public static int lucky(int[] values){
		int total = 0;
		for(int x : values){
			if(x == 7){
				total += 1;
			}
		}
		return total;
	}
	
	public static void testLucky(int[] values, int expected){
		int result = lucky(values);
		
		for(int x : values){
			System.out.println(x + " ");
		}
		System.out.print(" expected: " + expected + " result: " + result + " ");
		
		if(result == expected){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args){
		int[] values = {1, 2, 7};
		int[] values1 = {7, 0, 7};
		int[] values2 = {7, 7, 7};
		
		testLucky(values, 1);
		testLucky(values1, 2);
		testLucky(values2, 3);
	}

}
