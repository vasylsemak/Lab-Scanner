import java.util.Scanner;

public class ExampleTwo {
	
	public static void main(String[] args) {
		String numbers = "123456789";
		String comaSeparated = "";
		int count = 0;
		
		Scanner scanner = new Scanner(numbers);
		scanner.useDelimiter("");
		
		while(scanner.hasNextInt()) {
			int nextNum = scanner.nextInt();
			count += nextNum;
			comaSeparated += nextNum;
			
			if(scanner.hasNextInt()) comaSeparated += ",";
		}
		
		System.out.println("comaSeparated: " + comaSeparated);
		System.out.println("Count: " + count);
		System.out.println("is comaSeparated a String? -> " + (comaSeparated instanceof String));
		
		scanner.close();
	}

}
