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
/**
* This interface defines the signatures of methods used in Boxcar and Movie, and defines 
* the method starString.
*
* @author Uri J Schild
* @version 4 0
* @since 20 3 08
*/
public interface RatingItem4
{
	public abstract int rating();
	public abstract void facts();
	public abstract String getName();
	public abstract String starString(int n);
} 