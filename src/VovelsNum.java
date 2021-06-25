import java.util.Scanner;

public class VovelsNum {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your word below:");
		
		String line = scanner.nextLine();
		int count = 0;
		
		for(int i = 0; i < line.length(); i++) {
			char currChar = line.charAt(i);
			
			if(isVowel(currChar)) count++;
		}
		
		System.out.println("Vowels in your world: " + count);
		scanner.close();
	}
	
	
	public static boolean isVowel(char letter) {
		if("aeiouAEIOU".indexOf(letter) != -1) return true;
		else return false;
	}
}


//if(line[i].matches(".*[^a-z].*")) vowels.concat("a");