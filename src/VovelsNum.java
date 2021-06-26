import java.util.Scanner;

public class VovelsNum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your word below:");
		
		String line = scanner.nextLine();
		int count = 0;
		
		Scanner lineSc = new Scanner(line);
		lineSc.useDelimiter("");
		
		while(lineSc.hasNext()) {
			String next = lineSc.next();
			if(isVowel(next)) count++;
		}
		
		
		System.out.println("Vowels in your world: " + count);
		scanner.close();
		lineSc.close();
	}
	
	
	public static boolean isVowel(String letter) {
		if("aeiouAEIOU".indexOf(letter) != -1) return true;
		else return false;
	}
}
