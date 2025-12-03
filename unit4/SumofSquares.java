public class SumofSquares{
	public static int sumofSquares(int n){
		int value = 0;
		for(int i = 1; i<n + 1; i++){
			value += i*i;
		}
		return value;//because function is int it has to return an int
	}
	
	public static void testsumofSquares(int n, int expected){
		int result = sumofSquares(n);
		System.out.println("number:" + n + " expected:" + expected + " result:" + result);
        
        if (result == expected)
            System.out.println("good");
        else
            System.out.println("bad");
		
	}
	
	public static void main(String[] args){
		testsumofSquares(1,1);
		testsumofSquares(2,5);
		testsumofSquares(3,14);
		testsumofSquares(4,30);
		testsumofSquares(5,55);
		testsumofSquares(67, 102510);
	}





}
