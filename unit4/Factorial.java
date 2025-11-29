public class Factorial{
	public static int factorial(int n){
		int fact = 1;
		for(int i = n; i > 0; i--){
			fact *= i;
		}
		return fact;
	}
	
	
	
	public static void main(String[] args){
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		System.out.println(factorial(4));
		System.out.println(factorial(5));
	}




}
