public class Attention{
	
	public static boolean attention(String str){
		if (str.substring(0,9).equals("Hey, you!")){
			return true;
		}else{
			return false;
		}
	}
	
	public static void testattention(String str, boolean expected){
		boolean result = attention(str);
		if (expected == result){
			System.out.println("yes!");
		}else{
			System.out.println("no!");
		}
	}
	
	public static void main(String[] args){
		testattention("Hey, you!", true);
		testattention("Hello, my name is Inigo Montoya.", false);
		testattention("Excuse me, Dr. Kessner?", false);
		testattention("Hey, you! Give me your code!", true);
	}
	
	
}
