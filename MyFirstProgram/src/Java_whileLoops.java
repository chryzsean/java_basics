import java.util.Scanner;

public class Java_whileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";

	//	Example of While loop
		
		
	/*	while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
			
		}
		
		System.out.println("Hello "+name);
		
	*/
		
	//	Do  while loop
		
		
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
			
		} while(name.isBlank());
		
		System.out.println("Hello "+name);
		
	}
	
	

}
