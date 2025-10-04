public class Vampire{
	
	public static boolean isVampire(float hour, boolean awake){
	 if(!awake && (hour >= 6 || hour <=22)){
		return(true);
	 }else if(awake && (hour < 6 || hour >22)){
		return(true);
	 }else{
		return(false);
	 }
	}
	
	public static void testisVampire(float hour, boolean awake, boolean expected){
		boolean result = isVampire(hour, awake);
		
		System.out.println("Hour: " + hour + "Awake: " + awake + "Result: " + result + "Expected: " + expected);
		
		if(result == expected){
			System.out.println("omg she's acc a vampire");
		}else{
			System.out.println("thank god she's not a bleh bleh bleh");
		}
	}
	
	public static void main(String[] args){
		testisVampire(6, false, true);
		testisVampire(11, false, true);
		testisVampire(6, true, false);
		testisVampire(5, true, true);
		testisVampire(23, true, true);
		testisVampire(12, true, false);
	}
}
