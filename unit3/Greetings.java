public class Greetings{
	public static String greetings(String name){
		String hi = "Hello, " + name + ", how are you?";
		return hi;
	}


	public static void testgreetings(String name){
		String result = greetings(name);
		System.out.println(result);
		
	}
	
	public static void main(String[] args){
		testgreetings("Elissa");
		testgreetings("Ascii Cat");
		testgreetings("(>^.^<)");
		testgreetings("Sydneys");
	}
}
