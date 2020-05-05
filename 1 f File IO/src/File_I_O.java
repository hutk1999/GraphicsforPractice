import java.io.*;
import java.util.Scanner;

public class File_I_O {

    public File_I_O() {   }

    public static void main(String[] args) throws IOException  { 

	// declarations of input source:
    
        Scanner inp1 = new Scanner (System.in); 

        // string receiving input:

        String s;

	// creation of output object:

	String file = "C:/text3.txt";
	FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
	PrintWriter outFile = new PrintWriter(bw);

	for (int i=0; i<4; i++) {


		// We type line on screen, it is input into s.
		// To check we output it back on screen:
        
		System.out.println("Please type line on screen: \n"); 
        	s = inp1.nextLine();
		System.out.println("The line you input is:");
		System.out.println(s);
		System.out.println();

		// We now output it to file outFile, and print a message
		// about the creation of text file C:\text3.txt

		outFile.println(s);
		
	}
	outFile.close();
	System.out.println("File C:/text3.txt has been created \n");
	System.out.println();


	// We finally read a line from the newly created file,
	// and check it by printing it on screen

	Scanner inp2 = new Scanner (new File(file));
	for(int i=0; i<4; i++)  {
		s = inp2.nextLine();
		System.out.println("This is what we get from reading file C:/text3.txt:");
		System.out.println(s);
	}

					
      							
    }								
}								

