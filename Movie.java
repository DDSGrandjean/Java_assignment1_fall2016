public class Movie 
{
	Rating viewerRating;
	Rating criticRating;
	
	String title;
	int releaseYear;
	
	//Return formatted string
	public String toString()
	{
		return String.format("Title: %s\n" +
			   "Release year: %s\n" +
			   "Ratings:\n" +
			   "\tViewer: Total: %,.0f; Thumbs-up: %,d\n" +
			   "\tCritics: Total: %,.0f; Thumbs-up: %,d\n\n",
			   title, releaseYear, viewerRating.total, viewerRating.thumbsUp, 
			   criticRating.total, criticRating.thumbsUp);
	}
}
