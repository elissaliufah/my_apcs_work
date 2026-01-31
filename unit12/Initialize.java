import java.util.*;
public class Initialize{
	
	public static void printStuff(int[][] integers)
    {
        // demonstration of a for-each loop to iterate through 2D array

        for (int[] row : integers) // for each row
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
    
    public static void printStuff2(float[][] values)
    {
        // demonstration of a for-each loop to iterate through 2D array

        for (float[] row : values) // for each row
        {
            for (float value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
    public static void printStuff4(float[][] massive)
    {
        // demonstration of a for-each loop to iterate through 2D array

        for (float[] row : massive) // for each row
        {
            for (float value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
    public static void printStuff3(String[][] strings)
    {
        // demonstration of a for-each loop to iterate through 2D array

        for (String[] row : strings) // for each row
        {
            for (String value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
	
	public static void main(String[] args)
    {
		float[][] values = new float[5][5];
		for(int i = 0; i< values.length; i++){
			for(int j = 0; j < values[i].length; j++){
				if(i == j){
					values[i][j] = 5.0f;
					}
				else{
					values[i][j] = 0.0f;
					}
				}
			}
			
		String[][] strings = { 
            {"hi", "my", "name"}, 
            {"is", "not"}, 
            {"lexi"} 
		};
			
		int[][] integers = new int[6][5];
		for(int[] row : integers){
			for(int i = 0; i < integers.length; i++){
				for(int j = 0; j < integers[i].length; j++){
					integers[i][j] = j + 1;
					}
				}
			}
			
		float[][] massive = new float[5][5];
		for(int i = 0; i < massive.length; i++){
			if(i == 0){
				for(int j = 0; j < massive[i].length; j++){
					massive[i][j] = 11+j;
				}
			}
			if(i == 1){
				for(int j = 0; j < massive[i].length; j++){
					massive[i][j] = 21+j;
				}
			}
			if(i == 2){
				for(int j = 0; j < massive[i].length; j++){
					massive[i][j] = 31+j;
				}
			}
			if(i == 3){
				for(int j = 0; j < massive[i].length; j++){
					massive[i][j] = 41+j;
				}
			}
			if(i == 4){
				for(int j = 0; j < massive[i].length; j++){
					massive[i][j] = 41+j;
				}
			}
			if(i == 5){
				for(int j = 0; j < massive[i].length; j++){
					massive[i][j] = 51+j;
				}
			}
		}
			
        printStuff2(values);
        printStuff(integers);
        printStuff3(strings);
        printStuff4(massive);
    }
	

}
	
	
