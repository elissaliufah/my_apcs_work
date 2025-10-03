public class monkeyTrouble{
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
	  if(aSmile == true && bSmile == true){
		return(true);
	  }else if(aSmile == false && bSmile == false){
		return(true);
	  }else{
		return(false);
	  }
	}
	
	public static void testmonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected){
		boolean result = monkeyTrouble(aSmile, bSmile);
		
		System.out.println("aSmile: " + aSmile + "bSmile: " + bSmile + "Result: " + result + "Expected: " + expected);
		
		if(result == expected){
			System.out.println("WOOHOOO!");
		}else{
			System.out.println("NAWWW!");
		}
	}


	public static void main(String[] args){
		testmonkeyTrouble(true, true, true);
		testmonkeyTrouble(false, false, true);
		testmonkeyTrouble(true, false, false);
	}
}
