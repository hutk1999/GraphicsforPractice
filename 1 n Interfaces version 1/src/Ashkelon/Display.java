package Ashkelon;
public class Display {
	static String starString (int n) {
		String s = "";
		if (n == 0) return ("No stars ");
		for (int counter = 0; counter < n; ++ counter) {
			s = s + "*";
		}
		return (s);
	}
}