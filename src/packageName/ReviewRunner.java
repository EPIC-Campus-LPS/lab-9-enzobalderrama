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
		int i = 0;
		while(sc.hasNextLine()) {
			bigline = sc.nextLine();
			String[] arr = bigline.split(",");
			movies[i] = new Movie(arr[0], arr[1]);
			i++;
		}
		sc.close();
	}


}
