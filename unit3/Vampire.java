public class Vampire{
	
	public static boolean isVampire(float hour, boolean awake){
	 return((!awake && (hour >= 6 && hour <=22))||(awake && (hour < 6 || hour >22)));
	 
    }
	
	public static void testVampire(float hour, boolean awake, boolean expected){
		boolean result = isVampire(hour, awake);
		
		System.out.println("Hour: " + hour + "Awake: " + awake + "Result: " + result + "Expected: " + expected);
		
		if(result == expected){
			System.out.println("omg she's acc a vampire");
		}else{
			System.out.println("thank god she's not a bleh bleh bleh");
		}
	}
	
	public static void main(String[] args){
		testVampire(6, false, true);
		testVampire(11, false, true);
		testVampire(6, true, false);
		testVampire(5, true, true);
		testVampire(23, true, true);
		testVampire(12, true, false);
	}
}
