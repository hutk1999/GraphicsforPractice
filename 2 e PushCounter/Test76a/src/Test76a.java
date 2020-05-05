
public class Test76a {
		int p = 3;
		public static void f(Test76a a, Test76a b) {
			b = a;
			System.out.println("b.p=  " + b.p);
			b.p = 4;}
		public static void main(String[] args){
			Test76a x = new Test76a();
			Test76a y = new Test76a();
			x.p = 0;
			System.out.println("x.p=  " + x.p);
			System.out.println("y.p=  " + y.p);
			y.p = 1;
			System.out.println("x.p=  " + x.p);
			System.out.println("y.p=  " + y.p);
			f(x, y);
			y = x;
			System.out.println("x.p=  " + x.p);
			System.out.println("y.p=  " + y.p);
		}
	}

	
