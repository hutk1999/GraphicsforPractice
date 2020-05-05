package ujs;
import ujs.MergeSort;


public class Test {

	public static void main( String args[] ) {
        Integer[] intArray = { 5, 4, 3, 2, 1 };
        Double[] doubleArray = { 4.4, 3.3, 2.2, 1.1 };
        Character[] charArray = { 'o', 'l', 'l', 'e', 'h' };

	  MergeSort mergesort = new MergeSort();

        System.out.println( "Array integerArray contains:" ); 	   
        printArray( intArray ); 
        mergesort.sort(intArray);
	  System.out.println( "Array integerArray contains:" );  
        printArray( intArray ); 

	  System.out.println( "\nArray doubleArray contains:" );  
        printArray( doubleArray); 
	  mergesort.sort(doubleArray);
        System.out.println( "\nArray doubleArray contains:" );  
        printArray( doubleArray);

        System.out.println( "\nArray characterArray contains:" );  
        printArray( charArray); 
	  mergesort.sort(charArray);
	  System.out.println( "\nArray characterArray contains:" );  
        printArray( charArray); 
    } 
	
	 // generic method printArray                         
	   public static < E > void printArray( E[] inputArray ) {             
	         for ( E element : inputArray ){        
	            System.out.printf( "%s ", element );
	         }
	         System.out.println();
	}
}

