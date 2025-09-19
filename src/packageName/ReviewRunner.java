package packageName;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReviewRunner {

	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		Scanner sc = new Scanner(file);
		String bigline;
		String movies[] = new String[150];
		MovieRunner bestone = null;
		MovieRunner highestRated = null;
		String bestmoviename = null;
		String bestestmoviename = null;
		Movie oldestone = null;
		Movie realoldestone = null;
		while(sc.hasNextLine()) {
			bigline = sc.nextLine();
			String[] arr = bigline.split(", ");
			bigline = sc.nextLine();
			String[] arre = bigline.split(", ");
			Movie m1 = new Movie(arr[0], Integer.valueOf(arr[1]));
			MovieRunner mr1 = new MovieRunner(Double.valueOf(arr[2]));
			
			if (highestRated == null) {
				highestRated = mr1;
			}
			if (realoldestone == null) {
				realoldestone = m1;
			}
			
			Movie m2 = new Movie(arre[0], Integer.valueOf(arre[1]));
			MovieRunner mr2 = new MovieRunner(Double.valueOf(arre[2]));
			
			bestone = mr1.highRate(mr1, mr2);
			if (bestone.equals(mr2)) {
				bestmoviename = m2.getTitle();
			}
			else {
				bestmoviename = m1.getTitle();
			}
			highestRated = bestone.highRate(bestone, highestRated);
			if (highestRated.equals(bestone)) {
				bestestmoviename = bestmoviename;
			}
			System.out.println("Top Rated Movie: " + bestestmoviename);
			
			oldestone = m1.oldMovie(m1, m2);
			realoldestone = oldestone.oldMovie(oldestone, realoldestone);
			System.out.println("Oldest Movie: " + realoldestone);
		}
		sc.close();
	}

	


}
