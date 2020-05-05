import java.io.*;
import java.util.Scanner;
/**
*
test of javadoc
@author Uri Schild
*/
public class StringConversion {
	public static void main (String[] args) {
	String s = "11";
	String t = "111";
	String u = "1111";
	int x1 = 112;
	double y1 = 1122.00;

						   // string to number

	int x = (Integer.valueOf(s)).intValue();
	int y = Integer.valueOf(t);
	int z = Integer.parseInt(u);

						   // number to string in println

	System.out.println("x: " + x + "  y: " + y + "  z: " + z);

						   // number to string in general
	s = String.valueOf(2);
	t = String.valueOf(x1);
	u = String.valueOf(y1);
	System.out.println("s: " + s + "  t: " + t + "  u: " + u);

						   // number to string second time

	s = Integer.toString(x1);
	t = Double.toString(y1);
	System.out.println("s: " + s + " t: " + t);
	}
} 