import java.util.Scanner;
public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int    int1    ,    int2 ;
		short  short1  ,  short2 ;
		float  float1  ,  float2 ;
		double double1 , double2 ;
		
		System.out.print("Input two integer numbers: ");
		int1 = input.nextInt();
		int2 = input.nextInt();
		System.out.println("Add of " + int1 + " + " + int2 + " is " + (int1+int2));
		System.out.println("Sub of " + int1 + " - " + int2 + " is " + (int1-int2));
		System.out.println("Mul of " + int1 + " * " + int2 + " is " + (int1*int2));
		System.out.println("Div of " + int1 + " / " + int2 + " is " + (int1/int2));
		System.out.println("Rem of " + int1 + " % " + int2 + " is " + (int1%int2));
		
		System.out.print("Input two short numbers: ");
		short1 = input.nextShort();
		short2 = input.nextShort();
		System.out.println("Add of " + short1 + " + " + short2 + " is " + (short1+short2));
		System.out.println("Sub of " + short1 + " - " + short2 + " is " + (short1-short2));
		System.out.println("Mul of " + short1 + " * " + short2 + " is " + (short1*short2));
		System.out.println("Div of " + short1 + " / " + short2 + " is " + (short1/short2));
		System.out.println("Rem of " + short1 + " % " + short2 + " is " + (short1%short2));
		
		System.out.print("Input two float numbers: ");
		float1 = input.nextFloat();
		float2 = input.nextFloat();
		System.out.println("Add of " + float1 + " + " + float2 + " is " + (float1+float2));
		System.out.println("Sub of " + float1 + " - " + float2 + " is " + (float1-float2));
		System.out.println("Mul of " + float1 + " * " + float2 + " is " + (float1*float2));
		System.out.println("Div of " + float1 + " / " + float2 + " is " + (float1/float2));
		System.out.println("Rem of " + float1 + " % " + float2 + " is " + (float1%float2));
		
		System.out.print("Input two double numbers: ");
		double1 = input.nextDouble();
		double2 = input.nextDouble();
		System.out.println("Add of " + double1 + " + " + double2 + " is " + (double1+double2));
		System.out.println("Sub of " + double1 + " - " + double2 + " is " + (double1-double2));
		System.out.println("Mul of " + double1 + " * " + double2 + " is " + (double1*double2));
		System.out.println("Div of " + double1 + " / " + double2 + " is " + (double1/double2));
		System.out.println("Rem of " + double1 + " % " + double2 + " is " + (double1%double2));
		
		input.close();
		
	}

}
