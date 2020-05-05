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
* This class shows how to compute the rating of a boxcar
*
* @author Uri J Schild
* @version 4 0
* @since 20 3 08
*
*/
public class Boxcar4 implements RatingItem4
{
	public int length, width, height;
	String waggonNumber;
/**
* This constructor returns the value of waggonNumber
*
*/	
	public Boxcar4 ( String s)
		{ waggonNumber = s; }

	public String getName() { return waggonNumber; }

/**
* This method computes the basic numerical rating of a boxcar
*
* @param There are no parameters
* @return The volume of the boxcar divided by 50
*
*/
	public int rating()
	{
		return (length * width * height)/50 ;
	}

/**
* This method inputs the boxcar dimensions
*
* @param There are no parameters
* @return There is no return value
*
*/
	public void facts()
	{
		System.out.println("\n" + "Please give length, width and height"  +  "\n"  +
				    "for boxcar:  " +  waggonNumber + "\n");
		Scanner scan = new Scanner(System.in);
		length = scan.nextInt();
		width = scan.nextInt();
		height = scan.nextInt();
		System.out.println("height: " + height  + "  width: " + width + "  height: " + 				   height + "\n");
	}

/**
* This method computes the rating of a boxcar as a number of stars
*
* @param int n is the numerical rating
* @return String s is the required number of stars
*
*/
	public String starString(int n)  {
		String s = "";
		if (n == 0) return ("No stars ");
		for (int counter = 0; counter < n; ++ counter) {
			s = s + "*";
		}
		return (s);
	}

	
}