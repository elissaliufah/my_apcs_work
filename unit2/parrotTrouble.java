public class parrotTrouble{
	
	public static boolean parrotTrouble(boolean talking, int hour) {
	  if(talking == true && (hour < 7||hour>20)){
		return(true);
	  }else{
		return(false);
	  }
	}
	
	public static void testparrotTrouble(boolean talking, int hour, boolean expected){
		boolean result = parrotTrouble(talking, hour);
		
		System.out.println("Talking: " + talking + "Hour: " + hour + "Result: " + result + "Expected: " + expected);
		
		if(result == expected){
			System.out.println("AWESOME!");
		}else{
			System.out.println("NOIOIIIRRR!");
		}
	}
	
	public static void main(String[] args){
		testparrotTrouble(true, 8, false);
		testparrotTrouble(true, 7, false);
		testparrotTrouble(false, 6, false);
	}
	
	
}

