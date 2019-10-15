package assignment5_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//create movie tester class
public class Movie_Tester {
	
	//create main
	public static void main(String[] args) {
		
		//create new instance of scanner
		Scanner input = new Scanner(System.in);
		List<String> mList = new ArrayList<>(); //Create new array
		System.out.println("Welcome to the movie database");
		
		//create for loop
		for(int i = 0; i < 3; i++) {
			//get input from user, declare and initialize variables
			System.out.print("Please enter movie name: ");
			String mTitle = input.next();
			System.out.print("Please enter movie genre: ");
			String mGenre = input.next();
			System.out.print("Please enter movie rating: ");
			int mRating = input.nextInt();
			Movie movie = new Movie(mTitle, mGenre, mRating);
			
			//add input to array
			mList.add(movie.getTitle());
			mList.add(movie.getGenre());
			mList.add(movie.toString());
		}
		//traverse and display array contents, call playIt() using for loop
		for(int n = 0; n<9; n += 3){
			System.out.println("\nMovie: " + mList.get(n) + "\nGenre: " + mList.get(n + 1)
			+ "\nRating: " + mList.get(n + 2));
			Movie.playIt();
		}
		input.close();//close scanner
	}
}
