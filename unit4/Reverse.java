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
	
	//ask Ramya why minus 1?
	
	
	
	public static void main(String[] args){
		System.out.println(reverse("bad"));
		System.out.println(reverse("Hello, world!"));
		System.out.println(reverse("tacocat"));
		System.out.println(reverse("mom"));
		System.out.println(reverse("eta"));
		System.out.println(reverse("poop"));
	}

}


//public class Reverse 
	//public static String reverse(String str){
		//String flip = ""; 
		//for(int i = str.length()-1; i >= 0; i--){
			//flip += str.charAt(i);
		//}
		//return flip; 
	//}
	
	//public static void main(String[] args) {
		//System.out.println(reverse("bad"));
		//System.out.println(reverse("Hello, world!"));
		//System.out.println(reverse("tacocat"));
		//System.out.println(reverse("What's up?"));
	//}
//}



