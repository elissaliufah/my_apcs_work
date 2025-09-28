public class GoodDeal
{
    // The function you want to implement

    public static boolean goodDeal(double originalPrice, 
                                        double salePrice) 
    {
        // Remember that a comparison returns a boolean.
	return (salePrice <= 0.75 * originalPrice); 
    }

    // The test function, which takes as input:
    // 1) arguments for the monkeyTrouble() function
    // 2) the expected output from the function

    public static void testgoodDeal(double originalPrice,
                                         double salePrice, 
                                         boolean expected)
    {
        boolean result = goodDeal(originalPrice,
									 salePrice);
        
        System.out.print("Original Price: " + originalPrice +
                " Sale Price: " + salePrice + 
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
        
        testgoodDeal(20,10, true);
        testgoodDeal(15,5, true);
        testgoodDeal(5,20, false);
        testgoodDeal(2,20, false);

    }
}
