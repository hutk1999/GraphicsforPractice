

import java.awt.*;

import javax.swing.*;



import java.awt.*;
import javax.swing.*;


public class LaterExample1 {
	public static void main(String[] args)
	{ 
      	   Runnable doHelloWorld = new Runnable() {
               public void run() {
                   System.out.println("Hello World on " + 
		                       Thread.currentThread());
               }
           };

        SwingUtilities.invokeLater(doHelloWorld);
        System.out.println("This might be displayed before" + 
		           " the other message." +
		           Thread.currentThread());

	}
}