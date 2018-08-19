import java.util.Scanner;

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		String a1, a2, a3, a4;
		int lbs, kgs;
		
		System.out.print("What is your name? ");
		a1 = input.next(); 
		
		System.out.print("How much pounds do you weight? ");
		lbs = input.nextInt();
		
		kgs = (int) (lbs/2.2);
				
		System.out.print("Where are you from? ");
		a2 = input.next();
		
		System.out.print("What are some of your favorite hobbies? ");
		a3 = input.next();
		
		System.out.print("Why do you want to work here? ");
		a4 = input.next();

		System.out.println("The interviewee's name is " + a1 + ". ");
		System.out.println(a1 + " weights " + kgs + " kgs. ");
		System.out.println(a1 + " is from " + a2 + ". ");
		System.out.println(a1 + "'s activities include " + a3 + ". ");
		System.out.println(a1 + " wants to work here because " + "\"" + a4 + ".\"");
		
		input.close();
		
	}

}
