/**
* The package Ashkelon is an example of the use of interfaces, packages and javadoc
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
* This class shows how to find the rating of a film
*
* @author Uri J Schild
* @version 4 0
* @since 20 3 08
*
*/
public class Movie4 implements RatingItem4
{
	int script, acting, directing;
	String movieName;
/**
* This constructor initializes the variable movieName
*
* @param String s in order to initialize movieName
*
*/	
	public Movie4 ( String s)
		{ movieName = s; }

	public String getName() { return movieName; }
		  

/**
* This method computes the rating of a film
*
* @param There are no parameters
* @return the computed rating
*
*/
	public int rating()
	{  return (script + acting + directing)/3;  }


/**
* This method inputs the evaluations of script, acting and directing
*
* @param There are no parameters
* @return There is no return value
*
*/
	public void facts () 
	{
		System.out.println("\n" + "Please evaluate the script, acting and directing"+"\n"
				     + "by suppying numbers between 0 and 5 for the movie:" + "\n"
   				     + movieName + "\n");
		Scanner scan = new Scanner(System.in);
		script = scan.nextInt();
		acting = scan.nextInt();
		directing = scan.nextInt();
		System.out.println("\n" + "Title: " + movieName + "   script: " + script +
				   "  acting: " + acting  + "  directing:  " + directing + "\n");
	}

/**
*This method computes the rating as a string of stars
*
* @param int n is the numerical rating
* @return String s the required number of stars
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
