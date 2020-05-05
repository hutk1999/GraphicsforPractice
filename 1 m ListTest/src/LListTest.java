import java.util.*;

/**
*
* This program demonstrates operations on linked lists
*
*
*/
public class LListTest {	
	public static void main(String[] args) {
		LinkedList<String> example0 = new LinkedList<String>();
		example0.add("Paul");
		example0.add("Pete");
		example0.add("John");
		example0.add("George");
		System.out.println(example0);

		// show use of add(), next() and remove() methods

		ListIterator<String> zeroIter = example0.listIterator();
		String first = zeroIter.next();
		String second = zeroIter.next();
		System.out.println(second);
		zeroIter.next();
		zeroIter.next();
		example0.remove();
		System.out.println(example0);
		example0.add("Ringo");
		System.out.println(example0);

		LinkedList<String> example1 = new LinkedList<String>();
		example1.add("Paul");
		example1.add("Ringo");
		example1.add("John");
		example1.add("George");
		System.out.println(example1);

		LinkedList<String> example2 = new LinkedList<String>();
		example2.add("Sarah");
		example2.add("Rivka");
		example2.add("Leah");
		example2.add("Rachel");

		//merge elements from example2 into example1

		ListIterator<String> oneIter = example1.listIterator();
		ListIterator<String> twoIter = example2.listIterator();

		while (twoIter.hasNext()) {
			if (oneIter.hasNext()) oneIter.next();
			oneIter.add(twoIter.next());
		}

		System.out.println(example1);

		// remove every second word from example2

		twoIter = example2.listIterator();
		while (twoIter.hasNext()) {
		 	twoIter.next();		// skip one element
		 	if (twoIter.hasNext()) {
				twoIter.next(); 	// skip that element
				twoIter.remove();	// remove that element
		 	}
		}
		System.out.println(example2);

		// remove all words in example2 from example1

		example1.removeAll(example2);
		System.out.println(example1);

		// add() and remove() from middle of list

		/* previous() returns the element it has skipped over - 
		   just like next() */
	
		ListIterator<String> threeIter = example1.listIterator();
		String beetle1 = threeIter.next();
		System.out.println(beetle1);
		String beetle2 = threeIter.next();
		System.out.println(beetle2);
		String beetle3 = threeIter.previous();
		System.out.println(beetle3);
		String beetle4 = threeIter.previous();
		System.out.println(beetle4);
		String beetle5 = threeIter.next();
		System.out.println(beetle5);
		String beetle6 = threeIter.next();
		System.out.println(beetle6);
		threeIter.remove();
		String beetle7 = threeIter.next();
		System.out.println(beetle7);
		threeIter.add("Louis Armstrong");
		System.out.println(example1);

// note: add of iterator is not the same as add of LinkedList 

	
	}
}
