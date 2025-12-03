public class SumofSquaresArray{
	public static double sum(double[] values){
		double total = 0;
		for(double x : values){
			total += x*x;
		}
		return total;
	}
	
	public static void testSum(double[] values, double expected){
		double result = sum(values);
		
		for(double x : values){
			System.out.println(x + " ");
		}
		System.out.println("Result: " + result + " Expected: " + expected);
		
		if(result == expected){
			System.out.println("Slay!");
		}else{
			System.out.println("noir!");
		}
	
	}
	
	public static void main(String[] args){
		double[] values = {0, 1, 2};
		double[] values1 = {1, 0, 2};
		double[] values2 = {1, 2, 3};
		
		testSum(values, 5);
		testSum(values1, 5);
		testSum(values2, 14);
	}


}
