import java.util.Scanner;

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a1, a2, a3, a4, a5;
		
		System.out.print("What is your name? ");
		a1 = input.next(); 
		System.out.println("Their name is " + a1 + ".");
		
		System.out.print("How old are you? ");
		a2 = input.next();
		System.out.println("They are " + a2 + " years old.");
		
		System.out.print("Where are you from? ");
		a3 = input.next();
		System.out.println("They are from " + a3 + ".");
		
		System.out.print("What is your favorite color? ");
		a4 = input.next();
		System.out.println("Their favorite color is " + a4 + ".");
		
		System.out.print("What are your favorite shoes? ");
		a5 = input.next();
		System.out.println("Their favorite shoes are " + a5 + ".");
		
		input.close();
		
	}

}
