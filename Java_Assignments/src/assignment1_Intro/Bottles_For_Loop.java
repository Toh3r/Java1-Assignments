package assignment1_Intro;

public class Bottles_For_Loop {
	
	//Create main class
	public static void main(String[] args) {
		
		//Declare variable
		String word = "Bottles";
		
		//Create For Loop, Declare bottle variable
		for (int beernum = 99; beernum >= 1; beernum --){
			//create if statement to change word variable if bottle number is 1
			if (beernum == 1) {
				word = "bottle";
			}
			
			//Display text to console
			System.out.println(beernum + " " + word + " of beer on the wall");
			System.out.println(beernum + " " + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			//Display if statement if bottle number is more than 0
			if (beernum > 0) {
				System.out.println(beernum - 1 + " " + word + " of beer on the wall");
			}
			//Display else statement if bottle number is 0
			else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}//close main class
}//close public class

