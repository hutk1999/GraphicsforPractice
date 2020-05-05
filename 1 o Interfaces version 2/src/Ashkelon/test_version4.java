/**
* This package is an example of the use of interfaces, packages and javadoc
* It is intended for second year students at Ashkelon Academic College
* in the Algorithmic Programming course
*
* @author Uri J Schild
* @version 4 0
* @since 20 3 08
*/
package Ashkelon;
import java.util.Scanner;
/**
* This is the class containing the main method
*
*/
public class test_version4 
{
/**
* The main method shows the similarity of solving two rating problems
*
* @param There is no use of args
*/  
	public static void main(String[] args) 
	{
	
		Movie4 x = new Movie4("Gone with the wind");
		x.facts();
		String stars = x.starString (x.rating()); 
		System.out.println("Name: " + x.getName() + "     rating: " + stars);
		Boxcar4 y = new Boxcar4("Waggon 123");
		y.facts();
		stars = y.starString(y.rating());
		System.out.println("Name: " +  y.getName() + "  has rating:  "  + stars);
	}
} 