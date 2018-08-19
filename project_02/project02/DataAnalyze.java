package project02;
import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the sample size: ");

		int size = input.nextInt();

		int[]trl1 = new int[size];
		int[]trl2 = new int[size];
		int[]trl3 = new int[size];
		int[]trl4 = new int[size];

		int i = 0;
		
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		
		System.out.println("Enter numbers for Trial 0");

		for (i = 0; i < size; i++) {
			System.out.print("Enter sample # " + i + ": ");
			trl1[i] = input.nextInt();
		}

		System.out.println("Enter numbers for Trial 1");

		for (i = 0; i < size; i++) {
			System.out.print("Enter sample # " + i + ": ");
			trl2[i] = input.nextInt();
		}

		System.out.println("Enter numbers for Trial 2");

		for (i = 0; i < size; i++) {
			System.out.print("Enter sample # " + i + ": ");
			trl3[i] = input.nextInt();
		}

		System.out.println("Enter numbers for Trial 3");

		for (i = 0; i < size; i++) {
			System.out.print("Enter sample # " + i + ": ");
			trl4[i] = input.nextInt();
		}

		System.out.println("\tSample #\tTrial 1\tTrail 2\tTrial 3\tTrial 4");

		for (i = 0; i < size; i++) {
			System.out.println("\t\t" + i + "\t" + trl1[i] + "\t" + trl2[i] + "\t" + trl3[i] + "\t" + trl4[i]);
			total1 += trl1[i];
			total2 += trl2[i];
			total3 += trl3[i];
			total4 += trl4[i];
		}

		System.out.println("Average: \t\t" + (total1 / size) + "\t" + (total2 / size) + "\t" + (total3 / size) + "\t" + (total4 / size));
		
		int[]average = {(total1 / size), (total2 / size), (total3 / size), (total4 / size)};

		int min = average[0];

		for (i = 1; i <= 3; i++) {
			if (min > average[0 + i]) {
				min = average[0 + i];
			}
		}
		
		System.out.println("Min Average: " + min);

		int max = average[0];

		for (i = 1; i <= 3; i++) {
			if (max < average[0 + i]) {
				max = average[0 + i];
			}
		}
		
		System.out.println("Max Average: " + max);

		if (min == max) {
			System.out.println("The trials match EXACTLY!");
		}

		else if (max < (2 * min)) {
			System.out.println("The trials concur with each other!");
		}
		else {
			System.out.println("The trials do NOT concur!");
		}
		
		input.close();
	}

}
