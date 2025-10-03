public class parrotTrouble{
	
	public static boolean parrotTrouble(boolean talking, int hour) {
	  if(talking == true && (hour < 7||hour>20)){
		return(true);
	  }else{
		return(false);
	  }
	}
	
	public static void main(String[] arg){
		System.out.println(parrotTrouble(true, 7));
	}
	
	
}

