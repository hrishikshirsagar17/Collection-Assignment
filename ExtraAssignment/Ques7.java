/*"Create a collection to maintain data in sorted order of Movie Rating and if 2 movies have
same rating then according to Theatrename (use Anonymous class for sorting) 
Theatre (Theatreid,Theatrename,location,Movie)
Movie (Movieid,Moviename,Rating)"
 */
package ExtraAssignment;
import java.util.*;


class Movie
{
	private int Movieid;
	private String Moviename;
	private float Rating;

	public Movie() {
	}

	public Movie(int movieid, String moviename, float rating) {
		super();
		Movieid = movieid;
		Moviename = moviename;
		Rating = rating;
	}

	public int getMovieid() {
		return Movieid;
	}

	public void setMovieid(int movieid) {
		Movieid = movieid;
	}

	public String getMoviename() {
		return Moviename;
	}

	public void setMoviename(String moviename) {
		Moviename = moviename;
	}

	public float getRating() {
		return Rating;
	}

	public void setRating(float rating) {
		Rating = rating;
	}

	@Override
	public String toString() {
		return "[Movieid=" + Movieid + ", Moviename=" + Moviename + ", Rating=" + Rating + "]";
	}


}

class Theatre
{
	private int Theatreid;
	private String Theatrename;
	private String location;
	private Movie movie;

	public Theatre() {
	}

	public Theatre(int theatreid, String theatrename, String location, Movie movie) {
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.movie = movie;
	}

	public int getTheatreid() {
		return Theatreid;
	}

	public void setTheatreid(int theatreid) {
		Theatreid = theatreid;
	}

	public String getTheatrename() {
		return Theatrename;
	}

	public void setTheatrename(String theatrename) {
		Theatrename = theatrename;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "[Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location
				+ ", movie=" + movie + "]";
	}
}
public class Ques7 {

	public static void main(String[] args) {

		List<Theatre> theatre=new ArrayList<>();

		theatre.add(new Theatre(101, "PVR", "Viman Nagar",new Movie(1, "Life Of Pi", 5.0f)));	
		theatre.add(new Theatre(102, "Carnival", "Kalyani Nagar", new Movie(2, "The Shape Of Water", 4.5f)));	
		theatre.add(new Theatre(103, "Cinepolis", "Magarpatta", new Movie(3, "Titanic", 4.5f)));	
		theatre.add(new Theatre(104, "Inox", "Bund Garden", new Movie(4, "The Joker", 4.5f)));	
		theatre.add(new Theatre(105, "E Square", "University Road",new Movie(5, "Gravity", 4.0f)));	

		Collections.sort(theatre, new Comparator<Theatre>() {

			@Override
			public int compare(Theatre o1, Theatre o2) {


				if(o1.getMovie().getRating() < o2.getMovie().getRating())
					return -1;
				else if(o1.getMovie().getRating() > o2.getMovie().getRating())
					return +1;
				else
					return o1.getTheatrename().compareTo(o2.getTheatrename());


			}

		});

		for(Theatre t:theatre)
			System.out.println(t);
	}

}
