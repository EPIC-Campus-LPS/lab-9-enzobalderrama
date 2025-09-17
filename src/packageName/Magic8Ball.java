package packageName;

public class Magic8Ball {
	private String[] answers = new String[16];
	public Magic8Ball(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			answers[i] = arr[i];
		}
	}
	
	public String predict() {
		return answers[(int)(Math.random()*15)];
	}
}
