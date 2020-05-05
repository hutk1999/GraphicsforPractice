public class FinallyExample {

	public static void main(String[] args) {
		int n = 2, m;
		m = f(n);
		System.out.println("m is:  " + m);
	}

	public static int f(int n) {
		try{
			int r = n * n;
			return r;             // use exit();
	      }
		finally {
			// NEVER use return in finally block
			if (n == 2) return 0; 
	            }
	}

}