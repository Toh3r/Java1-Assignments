package assignment5_Constructors;

//Create movie class
class Movie{
	//create private data members
	private String title;
	private String genre;
	private int rating;
	public static void playIt() {
		System.out.println("Playing the movie");
	}
	
	//create constructor
	public Movie() {}
	
	//create overloaded constructor
	public Movie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	
	//create getters and setters
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	//Override toString
	@Override
	public String toString() {
		return "" + rating;
	}
	
}//close class

