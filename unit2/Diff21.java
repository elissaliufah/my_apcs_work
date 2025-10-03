public class Diff21{

	public static int diff21(int n) {
	  if (n <= 21){
		int a = 21 - n;
		return a;
	  }else{
		int a = 2*(n - 21);
		return a;
	  }
	}

	public static void main(String[] args){
		System.out.println(diff21(32));
	}
}

