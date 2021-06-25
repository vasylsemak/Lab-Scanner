import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		System.out.println("Input: " + line);
		scanner.close();
	}

}
