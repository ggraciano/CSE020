import java.util.Scanner;

public class Errors3 { //This was missing.

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		//Int numerator;
		int numerator   = 0;
		//integer denominator;
		int denominator = 0;

		//System.println("This program divides two numbers.");
		System.out.println("This program divides two numbers.");
		//System.print("Enter the numerator: ");
		System.out.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		//denomintaor = kbd.nextInt();
		denominator = kbd.nextInt();

		//system.out.print(numerator);
		System.out.print(numerator);
		System.out.print("/");
		//system.out.Print(denominator);
		System.out.print(denominator);
		System.out.print(" = ");
		//System.out.Println((double) numerator/denominator);
		System.out.println((double) numerator/denominator);
		
		kbd.close(); //kbd.close(0); was missing
		
	}

} //This was missing.
