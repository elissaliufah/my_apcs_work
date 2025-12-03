public class Factorial{
	public static int factorial(int n){
		int fact = 1;
		for(int i = n; i > 0; i--){
			fact *= i;
		}
		return fact;
	}
	
	public static void testFactorial(int n, int expected){
		int result = factorial(n);
		System.out.println("Number: " + n + "Result: " + result + "Expected: " + expected);
		if(result == expected){
			System.out.println("Gg");
		}else{
			System.out.println("no gg");
		}
		
	}
	
	
	public static void main(String[] args){
		testFactorial(0, 1);
		testFactorial(1, 1);
		testFactorial(2, 2);
		testFactorial(3, 6);
		testFactorial(4, 24);
		testFactorial(5, 120);
	}


}
