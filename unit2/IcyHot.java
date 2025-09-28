public class IcyHot
{
    // The function you want to implement

    public static boolean icyHot(int temp1, 
                                        int temp2) 
    {
        // Remember that a comparison returns a boolean.
	if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
		return true;
	  } else {
		return false;
	  }
    }

    // The test function, which takes as input:
    // 1) arguments for the monkeyTrouble() function
    // 2) the expected output from the function

    public static void testicyHot(int temp1,
                                         int temp2, 
                                         boolean expected)
    {
        boolean result = icyHot(temp1, temp2);
        
        System.out.print("Temp1: " + temp1 +
                " Temp2: " + temp2 + 
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
        testicyHot(120, -1, true);
        testicyHot(-1, 120, true);
        testicyHot(2, 120, false);
        testicyHot(-1, 100, false);
        testicyHot(-2, -2, false);
        testicyHot(120, 120, false);
    }
}
