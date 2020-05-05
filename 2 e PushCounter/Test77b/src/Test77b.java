
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test77b
{
   public static void main(String[] args)
   {
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               JFrame frame = new JFrame("Java Test");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			   frame.getContentPane().add(new TestPanel77b());
               frame.setVisible(true);
			   frame.pack();
            }
         });
   }
}


