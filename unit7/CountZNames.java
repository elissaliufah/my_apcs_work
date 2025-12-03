public class CountZNames{
	public static int countZNames(String[] strings){
		int zcount = 0;
		for(String string : strings){
			if(string.substring(0,1).equals("z")){
				zcount += string.length();
			}else if(string.substring(0,1).equals("Z")){
				zcount += string.length();
			}
		}
		return zcount;
	}

	public static void testCountZNames(String[] strings, int expected){
		int result = countZNames(strings);
		for(String string : strings){
			System.out.println(string + " ");
		}
		System.out.println("Result: " + result + " Expected: " + expected);
		if(result == expected){
			System.out.println("SLAY!");
		}else{
			System.out.println("Plum Pudding Model");
		}
	}
	
	public static void main(String[] args){
		String[] strings = {"Dr. Kessner", "Dr. Sands"};
		String[] strings1 = {"Zorro", "zero", "zippy"};
		
		testCountZNames(strings, 0);
		testCountZNames(strings1, 14);
	}

}
