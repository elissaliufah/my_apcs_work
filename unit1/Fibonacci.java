//
// Hello.java
//

public class Fibonacci 
{
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        int a = 0;
        int b = 1;
        int c = a+b;
        for (int i = 0; a < 30; i++){
			c = a + b;
			a = b;
			b = c;
			System.out.println(a);
        }
    }
}

