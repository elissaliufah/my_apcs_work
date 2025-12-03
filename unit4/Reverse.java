public class Reverse{

	public static String reverse(String string){
		String flip = "";
		for(int i = string.length() - 1; i >= 0; i--){
			flip += string.charAt(i);
		}
		return flip;
	}
	
	//single equals is setting double equal checking
	//second parameter for for loop is checking as long as i blank is true then run it
	
	//ask Ramya why minus 1? it's because index is one less than length and they need to match
	
	public static void testReverse(String string, String expected){
		String result = reverse(string);
		System.out.println("String: " + string + "Result: " + result + "Expected: " + expected);
		if(result.equals(expected)){
			System.out.println("Gucci");
		}else{
			System.out.println("naw");
		}
		
	}
	
	public static void main(String[] args){
		testReverse("bad", "dab");
		testReverse("Hello, world!", "!dlrow ,olleH");
		testReverse("tacocat", "tacocat");
		testReverse("mom", "mom");
		testReverse("eta", "ate");
		testReverse("poop", "poop");
	}

}




