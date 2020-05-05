

import java.awt.*;

import javax.swing.*;



import java.awt.*;
import javax.swing.*;

import java.awt.*;
import javax.swing.*;

public class LaterExample0 {
	public static void main(String[] args)
	{ 

      	   class doHelloWorld implements Runnable {
               public void run() {
                   System.out.println("Hello World on " + 
		                       Thread.currentThread());
               }
           };

		Thread appThread = new Thread() {
             public void run() {
               Thread t2 = new Thread(new doHelloWorld());
      	       t2.start(); 
               System.out.println("Finished on " + 
                 Thread.currentThread());
             }
          };
          appThread.start();
        }
}

