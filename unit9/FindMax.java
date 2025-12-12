public class FindMax{
	public static double findMax(double [] values){
		double result = 0;
		for(double value : values){
			if(value > result){
				result = value;
			}
		
		}
		return result;
	}
	
	public static void main(String[] args){
        double[] values = {6, 5, 4, 1, 2, 3};

        System.out.print("values: ");
        for (double value : values){
            System.out.print(value + " ");
		}
        System.out.println("max: " + findMax(values));
    }


}
