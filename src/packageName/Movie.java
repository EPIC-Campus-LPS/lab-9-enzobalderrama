package packageName;

public class Movie {
	private String title;
	private int ryear;
	
	public Movie(String t, int ry) {
		title = t;
		ryear = ry;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return ryear;
	}
	public void setTitle(String t) {
		title = t;
	}
	public void setYear(int ry) {
		ryear = ry;
	}
	
	public Movie oldMovie(Movie m1, Movie m2) {
		if (m1.getYear() < m2.getYear()) {
			return m1;
		}
		return m2;
	}
}
