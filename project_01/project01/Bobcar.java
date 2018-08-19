package project01;
import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		int    a = 0; // Type of car
		int    b = 0; // Number of days
		int    c = 0; // Base cost of car
		int    d = 0; // Club member decision
		int    e = 0; // Club member cost
		int    f = 0; // Platinum Executive Package decision
		double g = 0; // Cost after Platinum Executive Package decision
		
		System.out.println("Welcome to Bobcar Rent-a-Car.");
		System.out.println("What type of car would, you like?");
		System.out.println("Choose 1 for Economy, 2 for Compact, or 3 for Standard.");
		System.out.print("Type of car: ");
		a = scnr.nextInt();
		
		if (a == 1) {
			System.out.println("You have chosen Economy.");
			System.out.println("The cost is $35 per day.");
			System.out.println("How many days would you like to rent the car for?");
			System.out.print("Number of days: ");
			b = scnr.nextInt();
			
			System.out.println("You have chosen " + b + " days.");
			c = (35 * b);
			
			System.out.println("Are you a club member?");
			System.out.println("Choose 1 for yes or 0 for no.");
			d = scnr.nextInt();
			
			if (d == 1) {
				e = (c - (35 * (b/7)));
				System.out.println("You are a club member.");
				System.out.println("Would you like the Platinum Executive Package?");
				System.out.println("Choose 1 for yes or 0 for no.");
				f = scnr.nextInt();
				
				if (f == 1) {
					g = (c * .15);
					System.out.println("You have chosen the Platinum Executive Package.");
					System.out.println("Your total estimate cost is $" + (e + g) + ".");
					System.out.println("");
					System.out.println("Summary");
					System.out.println("");
					System.out.println("Base: " + b + " days for a Economy @ $35 per day:   $" + c);
					System.out.println("Club member discount:                     - $" + (35 * (b/7)));
					System.out.println("Platinum Executive Package:               + $" + g);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                  $" + (e + g));
				}
				
				else if (f == 0) {
					System.out.println("You have not chosen the Platinum Executive Package.");
					System.out.println("Your total estimate cost is $" + e + ".");
					System.out.println("");
					System.out.println("Summary");
					System.out.println("");
					System.out.println("Base: " + b + " days for a Economy @ $35 per day:   $" + c);
					System.out.println("Club member discount:                     - $" + (35 * (b/7)));
					//System.out.println("Platinum Executive Package:               + $" + g);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                  $" + (e + g));
				}
				
			}
			
			else if (d == 0) {
				System.out.println("You are not a club member.");
				System.out.println("Your total estimate cost is $" + c + ".");
				System.out.println("");
				System.out.println("Summary");
				System.out.println("");
				System.out.println("Base: " + b + " days for a Economy @ $35 per day:   $" + c);
				//System.out.println("Club member discount:                     - $" + (35 * (b/7)));
				//System.out.println("Platinum Executive Package:               + $" + g);
				System.out.println("");
				System.out.println("Total Estimate for Rental:                  $" + (c));
			}
			
		}
		
		else if (a == 2) {
			System.out.println("You have chosen Compact.");
			System.out.println("The cost is $45 per day.");
			System.out.println("How many days would you like to rent the car for?");
			System.out.print("Number of days: ");
			b = scnr.nextInt();
			
			System.out.println("You have chosen " + b + " days.");
			c = (45 * b);
			
			System.out.println("Are you a club member?");
			System.out.println("Choose 1 for yes or 0 for no.");
			d = scnr.nextInt();
			
			if (d == 1) {
				e = (c - (45 * (b/7)));
				System.out.println("You are a club member.");
				System.out.println("Would you like the Platinum Executive Package?");
				System.out.println("Choose 1 for yes or 0 for no.");
				f = scnr.nextInt();
				
				if (f == 1) {
					g = (c * .15);
					System.out.println("You have chosen the Platinum Executive Package.");
					System.out.println("Your total estimate cost is $" + (e + g) + ".");
					System.out.println("");
					System.out.println("Summary");
					System.out.println("");
					System.out.println("Base: " + b + " days for a Compact @ $45 per day:   $" + c);
					System.out.println("Club member discount:                     - $" + (45 * (b/7)));
					System.out.println("Platinum Executive Package:               + $" + g);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                  $" + (e + g));
				}
				
				else if (f == 0) {
					System.out.println("You have not chosen the Platinum Executive Package.");
					System.out.println("Your total estimate cost is $" + e + ".");
					System.out.println("");
					System.out.println("Summary");
					System.out.println("");
					System.out.println("Base: " + b + " days for a Compact @ $45 per day:   $" + c);
					System.out.println("Club member discount:                     - $" + (45 * (b/7)));
					//System.out.println("Platinum Executive Package:               + $" + g);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                  $" + (e + g));
				}
				
			}
			
			else if (d == 0) {
				System.out.println("You are not a club member.");
				System.out.println("Your total estimate cost is $" + c + ".");
				System.out.println("");
				System.out.println("Summary");
				System.out.println("");
				System.out.println("Base: " + b + " days for a Compact @ $45 per day:   $" + c);
				//System.out.println("Club member discount:                     - $" + (45 * (b/7)));
				//System.out.println("Platinum Executive Package:               + $" + g);
				System.out.println("");
				System.out.println("Total Estimate for Rental:                  $" + (c));
			}
			
		}
		
		else if (a == 3) {
			System.out.println("You have chosen Standard.");
			System.out.println("The cost is $95 per day.");
			System.out.println("How many days would you like to rent the car for?");
			System.out.print("Number of days: ");
			b = scnr.nextInt();
			
			System.out.println("You have chosen " + b + " days.");
			c = (95 * b);
			
			System.out.println("Are you a club member?");
			System.out.println("Choose 1 for yes or 0 for no.");
			d = scnr.nextInt();
			
			if (d == 1) {
				e = (c - (95 * (b/7)));
				System.out.println("You are a club member.");
				System.out.println("Would you like the Platinum Executive Package?");
				System.out.println("Choose 1 for yes or 0 for no.");
				f = scnr.nextInt();
				
				if (f == 1) {
					g = (c * .15);
					System.out.println("You have chosen the Platinum Executive Package.");
					System.out.println("Your total estimate cost is $" + (e + g) + ".");
					System.out.println("");
					System.out.println("Summary");
					System.out.println("");
					System.out.println("Base: " + b + " days for a Standard @ $95 per day:   $" + c);
					System.out.println("Club member discount:                      - $" + (95 * (b/7)));
					System.out.println("Platinum Executive Package:                + $" + g);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                   $" + (e + g));
				}
				
				else if (f == 0) {
					System.out.println("You have not chosen the Platinum Executive Package.");
					System.out.println("Your total estimate cost is $" + e + ".");
					System.out.println("");
					System.out.println("Summary");
					System.out.println("");
					System.out.println("Base: " + b + " days for a Standard @ $95 per day:   $" + c);
					System.out.println("Club member discount:                      - $" + (95 * (b/7)));
					//System.out.println("Platinum Executive Package:                + $" + g);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                   $" + (e + g));
				}
				
			}
			
			else if (d == 0) {
				System.out.println("You are not a club member.");
				System.out.println("Your total estiamte cost is $" + c + ".");
				System.out.println("");
				System.out.println("Summary");
				System.out.println("");
				System.out.println("Base: " + b + " days for a Standard @ $95 per day:   $" + c);
				//System.out.println("Club member discount:                      - $" + (95 * (b/7)));
				//System.out.println("Platinum Executive Package:                + $" + g);
				System.out.println("");
				System.out.println("Total Estimate for Rental:                   $" + (c));
			}
			
		}
		
		else {
			System.out.println("The following option does not exist. Please choose another option.");
		}
		
		scnr.close();
		
	}

}
