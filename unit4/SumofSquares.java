public class SumofSquares{
	public static int sumofSquares(int n){
		int value = 0;
		for(int i = 1; i<n + 1; i++){
			value += i*i;
		}
		return value;//because function is int it has to return an int
	}
	
	
	
	public static void main(String[] args){
		System.out.println(sumofSquares(1));
		System.out.println(sumofSquares(2));
		System.out.println(sumofSquares(3));
		System.out.println(sumofSquares(4));
		System.out.println(sumofSquares(5));
		System.out.println(sumofSquares(67));
	}





}
