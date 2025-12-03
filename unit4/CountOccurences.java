public class CountOccurences{
	
	public static int countOccurences(String full, String str){
		int n = 0;
		for(int i = 0; i < full.length()-str.length()+1; i++){
			if(full.substring(i, i+str.length()).equals(str)){
				n +=1;
			}
		}
		return n;
		//don't have to add one to full.length because it checks the whole string already
		//make sure to add parenthesis after blank.length
		//once it gets to the point that the whole string is finished and you try to check for i, i+str.length() it's not possible!
	}
	
	public static void testcountOccurences(String full, String str, int expected){
		int result = countOccurences(full, str);
		System.out.println("String: " + full + "Mini string " + str + "Result: " + result + "Expected: " + expected);
		if(result == expected){
			System.out.println("Gg");
		}else{
			System.out.println("no gg");
		}
		
	}
	
	
	public static void main(String[] args){
		testcountOccurences("Mississippi", "iss", 2);
		testcountOccurences("banananana", "na", 4);
		testcountOccurences("How much wood would a woodchuck chuck if a woodchuck could chuck wood", "wood", 4);
		testcountOccurences("How much wood would a woodchuck chuck if a woodchuck could chuck wood", "chuck", 4);
		testcountOccurences("How much wood would a woodchuck chuck if a woodchuck could chuck wood", "woodchuck", 2);
	}

}
