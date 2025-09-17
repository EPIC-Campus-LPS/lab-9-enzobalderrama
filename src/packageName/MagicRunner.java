package packageName;
import java.util.Scanner;

public class MagicRunner {

	public static void main(String[] args) {
		String[] arr = {"Yes, definitely.", "Without a doubt.", "It is certain.", "Most likely.", "Outlook good.", "You may rely on it.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now", "Don't count on it.", "My sources say no.", "Outlook not so good.", "Very doubtful.", "Signs point to yes.", " "};
		arr[15] = arr[(int)(Math.random()*15)];
		Magic8Ball ball = new Magic8Ball(arr);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ask a yes or no question: ");
		scan.nextLine();
		System.out.println(ball.predict());
	}

}
