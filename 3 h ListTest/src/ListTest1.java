import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//This program demonstrates a simple fixed list of strings.
 public class ListTest1
{
	public static void main(String[] args)
	{ 
      		EventQueue.invokeLater(new Runnable()
		      {
		      public void run()
		        {
		        JFrame frame = new JFrame("ListTest"); 				              
				frame.setDefaultCloseOperation
                                         (JFrame.EXIT_ON_CLOSE);
				ListPanel1 panel = new ListPanel1();
				frame.getContentPane().add(panel);
				frame.pack();
     		        frame.setVisible(true);
		         }
	             });
	}
}