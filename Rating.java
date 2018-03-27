public class Rating 
{	
	double total;
	int thumbsUp;
	
	//Return average of thumbs-up
	public double getRating()
	{
		return (thumbsUp / total);
	}
	
	//Return formatted string
	public String toString()
	{
		return String.format("%,.2f", getRating());
	}

}
