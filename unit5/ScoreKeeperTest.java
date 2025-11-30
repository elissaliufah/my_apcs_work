public class ScoreKeeperTest{
	public static void main(String[] args){
		ScoreKeeper keeper = new ScoreKeeper();
		ScoreKeeper keepertwo = new ScoreKeeper();
		
		keeper.scoreNormal();
        keeper.scoreBonus();
        keepertwo.scoreNormal();
        
        System.out.println("Your score is: " + keeper.getScore());
        keeper.scoreBonus();
        System.out.println("Now your score is: " + keeper.getScore());
        System.out.println("Your pigs score is: " + keepertwo.getScore());
	}

}
