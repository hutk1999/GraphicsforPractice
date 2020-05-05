/**
 * 
 * @author us144
 * @version 3.2
 *
*/


public class Cat{

	int age = 3;
	
	/**
	 *  
	 * @param two cats named A and B 
	 * 
	*/
	public static void f(Cat a, Cat b) {

		b = a;
		System.out.println("b.age:" + b.age);
		b.age = a.age;
		System.out.println(b.age);	
	}
	/**
	 * 
	 * @param args - I never use this 
	 * 
	 */
	public static void main(String[] args){
		Cat a = new Cat();
		Cat b = new Cat();
		a.age = 1;
		b.age = 2;
		System.out.println(b.age);
		f(a, b);
		System.out.println(b.age);
		b = a;
		System.out.println(b.age);
	}
}