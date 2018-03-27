
public class MovieRating
{
	public static void main(String[] args) 
	{
		//Instantiate an array of movie and their information to be used in the application
		String[][] movieInfo = {{"Invasion of the Body Snatchers", "1978", "35304",  "26125", "48", "45"},
							    {"Inherit the Wind",               "1960", "9492",   "8638",  "22", "20"},
							    {"Erin Brockovich",                "2000", "128955", "94137", "143", "120"}};
		
		//Create an array of Movie Object 
		Movie[] movies = new Movie[movieInfo.length];

		//Populates the Movie array
		for(int i = 0; i < movieInfo.length; i++)
		{
			movies[i] = new Movie();
			movies[i].title = movieInfo[i][0];
			movies[i].releaseYear = Integer.parseInt(movieInfo[i][1]);
			
			movies[i].viewerRating = new Rating();
			movies[i].viewerRating.total = Integer.parseInt(movieInfo[i][2]);
			movies[i].viewerRating.thumbsUp = Integer.parseInt(movieInfo[i][3]);
			movies[i].criticRating = new Rating();
			movies[i].criticRating.total= Integer.parseInt(movieInfo[i][4]);
			movies[i].criticRating.thumbsUp = Integer.parseInt(movieInfo[i][5]);
		} 
		
		//Print movie info 
		for(Movie show : movies)
		{
			System.out.println(show.toString());
		}
	}
}
