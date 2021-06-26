import java.util.Scanner;

public class InteractionScannner {
	
	public static void main(String[] args) {
		InteractionScannner is = new InteractionScannner();
		
		System.out.println("Please enter first guess: ");
		is.makeInteraction();
	}
	
	public void makeInteraction() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		boolean isQ = (input.toLowerCase().equals("q"));
		
		if(isQ) {
			scan.close();
		} else if(input.equals("1")) {
			System.out.println("Moving Right");
			makeInteraction();
		} else if(input.equals("2")) {
			System.out.println("Moving Left");
			makeInteraction();
		} else if(input.equals("3")) {
			System.out.println("Moving Up");
			makeInteraction();
		} else if(input.equals("4")) {
			System.out.println("Moving Down");
			makeInteraction();
		} else {
			System.out.println("Try again. Accepatable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
			makeInteraction();
		}
	}
}