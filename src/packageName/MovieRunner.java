package packageName;

public class MovieRunner {
	private double score;
	public MovieRunner(double s) {
		score = s;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double s) {
		score = s;
	}
	public MovieRunner highRate(MovieRunner m1, MovieRunner m2) {
		if (m1.getScore() >= m2.getScore()) {
			return m1;
		}
		return m2;
	}
}
