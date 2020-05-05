/**
 ** Use Scanner class to read numerical data
 **/

import java.util.Scanner;


public class GasKilometer
{
	public static void main(String[] args)
	{

		int kilometers;
		double liters, kilometers_per_liter;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of kilometers: ");

		kilometers = scan.nextInt();
		//
		// the functions are: nextInt, nextFloat, nextDouble, etc.
		//
		System.out.println("Enter the number of liters used: ");
		liters = scan.nextDouble();
		kilometers_per_liter = kilometers/liters;
		System.out.println("number of kilometers per liter is: " 
					+ kilometers_per_liter); 

	}
}
