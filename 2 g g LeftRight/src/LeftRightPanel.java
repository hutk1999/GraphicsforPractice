
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LeftRightPanel extends JPanel {
	private JButton left, right;
	   private JLabel label;
	   private JPanel buttonPanel;

	//  Constructor: Sets up the GUI.
	   public LeftRightPanel () {
	   
	      left = new JButton ("Left");
	      right = new JButton ("Right");

	      ButtonListener listener = new ButtonListener();
	      left.addActionListener (listener);
	      right.addActionListener (listener);

	      label = new JLabel ("Push a button");

	/* NOTE: The two buttons are put on buttonPanel, which is itself put   
	   on LeftRightPanel. Resizing the frame will not change the buttons' 
	   visual relationship  */
	      buttonPanel = new JPanel();
	      buttonPanel.setPreferredSize (new Dimension(200, 40));
	      buttonPanel.setBackground (Color.blue);
	      buttonPanel.add (left);
	      buttonPanel.add (right);

	      setPreferredSize (new Dimension(200, 80));
	      setBackground (Color.cyan);
	      add (label);
	      add (buttonPanel);
	   }

	 //  Represents a listener for both buttons.
	   private class ButtonListener implements ActionListener {
	   
	 //  Determines which button was pressed and sets the label text 
	      public void actionPerformed (ActionEvent event){
	         if (event.getSource() == left)
	            label.setText("Left");
	         else
	            label.setText("Right");
	      }
	   }

}
