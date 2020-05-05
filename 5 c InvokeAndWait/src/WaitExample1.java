

import java.awt.*;

import javax.swing.*;





//This program demonstrates the use of javax.Swing.SwingUtilities.invokeAndWait.
 

/* The action is as follows:

	1. invokeAndWait causes the run() of doHelloWorld to be executed 
	   on the AWT Event Dispatch Thread in a synchronous manner
	2. It blocks all other threads (even after it finishes) until
	   all pending AWT events have been processed.
	3. Then it returns.
	4. Here: FIRST a string is printed from the AWT Event Dispatch
	   Thread.
	   SECOND another string is printed from some other thread.
*/



public class WaitExample1 {
   
	public static void main(String[] args)
  
	{ 

      	   final Runnable doHelloWorld = new Runnable() {
     	     public void run() {
             System.out.println("Hello World on " + Thread.currentThread());
             }
           };

          Thread appThread = new Thread() {
             public void run() {
               try {
                 SwingUtilities.invokeAndWait(doHelloWorld);
               }
               catch (Exception e) {
                 e.printStackTrace();
               }  
               System.out.println("Finished on " + Thread.currentThread());
             }
          };
          appThread.start();
        }
}

 