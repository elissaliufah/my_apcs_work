public class nearHundred{

	public static boolean nearHundred(int n) {
	  
	  if(Math.abs(100-n) <= 10 ||Math.abs(200-n) <= 10){
		return(true);
	  }else{
		return(false);
	  }
	}

	public static void testnearHundred(int n, boolean expected){
		boolean result = nearHundred(n);
		
		System.out.println("Number: " + n + "Result: " + result + "Expected: " + expected);
		
		if (result == expected){
			System.out.println("Awesome Sauce!");
		}else{
			System.out.println("NO loser");
		}
	}
	
	public static void main(String[] args){
		testnearHundred(100, true);
		testnearHundred(93, true);
		testnearHundred(90, true);
		testnearHundred(89, false);
	}
	
}

