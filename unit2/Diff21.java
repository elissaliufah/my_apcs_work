public class Diff21{

	public static int diff21(int n) {
	  if (n <= 21){
		int a = 21 - n;
		return a;
	  }else{
		int a = 2*(n - 21);
		return a;
	  }
	}
	
	public static void testDiff21(int n, int expected){
		int result = diff21(n);
		
		System.out.println("Number: " + n + "Result: " + result + "Expected: " + expected);
		
		if (result == expected){
			System.out.println("Great");
		}else{
			System.out.println("Bad");
		}
	}

	public static void main(String[] args){
		testDiff21(8, 13);
		testDiff21(21, 0);
		testDiff21(32, 22);
	}
}

