public class Vampire
{
    // The function you want to implement

    public static boolean isVampire(float hour, 
                                        boolean awake) 
    {
        // Remember that a comparison returns a boolean.
	return ((!awake && (hour > 6 || hour < 22)) || (awake && (hour < 6 || hour > 22))); 
    }

    // The test function, which takes as input:
    // 1) arguments for the monkeyTrouble() function
    // 2) the expected output from the function

    public static void testisVampire(float hour,
                                         boolean awake, 
                                         boolean expected)
    {
        boolean result = isVampire(hour,
									 awake);
        
        System.out.print("Hour: " + hour +
                " Awake: " + awake + 
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
        testisVampire(10,true,false);
        testisVampire(23,true,true);
        testisVampire(15,false,true);
        testisVampire(16,false,true);
        testisVampire(6,true,false);
        testisVampire(11,true,false);
        testisVampire(3,true,true);


    }
}

i did it wrong so make sure u have the right conditionals
