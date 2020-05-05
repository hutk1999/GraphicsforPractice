
import javax.swing.*;

public class JukeBox {

   //-----------------------------------------------------------------
   //  Creates and displays the controls for a juke box.
   //-----------------------------------------------------------------
   public static void main (String[] args) {
   
      JFrame frame = new JFrame ("Java Juke Box");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      JukeBoxControls controlPanel = new JukeBoxControls();

      frame.getContentPane().add(controlPanel);
      frame.pack();
      frame.setVisible(true);
   }
}
