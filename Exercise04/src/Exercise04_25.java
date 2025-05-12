
public class Exercise04_25 {

	public static void main(String[] args) {
		char char1 = (char)(Math.random() * 26 + 65);
		char char2 = (char)(Math.random() * 26 + 65);
		char char3 = (char)(Math.random() * 26 + 65);
		
		int char4 = (int)(Math.random() * 10);
		int char5 = (int)(Math.random() * 10);
		int char6 = (int)(Math.random() * 10);
		int char7 = (int)(Math.random() * 10);
		
		System.out.print("A random vehicle plate number: " + char1 + char2 + char3 + char4 + char5 + char6 + char7);
	}

}
