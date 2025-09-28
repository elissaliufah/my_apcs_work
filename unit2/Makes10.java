public class Makes10
{
    // The function you want to implement

    public static boolean makes10(int a, 
                                        int b) 
    {
        // Remember that a comparison returns a boolean.
	return (a == 10 || b == 10 || a+b == 10); 
    }

    // The test function, which takes as input:
    // 1) arguments for the monkeyTrouble() function
    // 2) the expected output from the function

    public static void testmakes10(int a,
                                         int b, 
                                         boolean expected)
    {
        boolean result = makes10(a, b);
        
        System.out.print("a: " + a +
                " b: " + b + 
                " expected: " + expected +
                " result: " + result + " ");

        if (result == expected)
            System.out.println("YAY!");
        else
            System.out.println("Boohoo!");
    }

    // Run several unit tests in the main() function.

    public static void main(String[] args)
    {
        testmakes10(9, 10, true);
        testmakes10(9, 9, false);
        testmakes10(1, 9, true);
        testmakes10(10, 1, true);
        testmakes10(10, 10, true);
        testmakes10(8, 2, true);
        testmakes10(8, 3, false);
        testmakes10(10, 42, true);
        testmakes10(12, -2, true);



    }
}
