import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import javax.swing.*;

public class TestPanel77b extends JPanel {

   private JButton startButton;
   private JCheckBox checkBox;
   private JTextField textField;
   private SimulatedActivity activity;
   private JLabel outputLabel;
   private JPanel buttonPanel;
   
   public TestPanel77b() {
  
      textField = new JTextField();
      setPreferredSize (new Dimension(300, 150));

      startButton = new JButton("Start");
	  buttonPanel = new JPanel();
      buttonPanel.setPreferredSize (new Dimension(100, 40));
      buttonPanel.setBackground (Color.white);
      buttonPanel.add (startButton);

      setLayout (new BorderLayout());
      outputLabel = new JLabel ("Number of lines is:");
      add(new JScrollPane(textField), BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
	  add(outputLabel, BorderLayout.NORTH);

      // set up the button action

      startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event)  {
               startButton.setEnabled(false);
               activity = new SimulatedActivity();
               activity.execute();
            }			// end of actionPerformed
         });			// end of command addActionListener
   }					// end of constructor TestPanel77b()
   class SimulatedActivity extends SwingWorker<Integer, String> {
       /*       Constructs the simulated activity that reads an initially unknown number of lines, 
	and prints the number of lines. */

	  String line;
	  private int N;
      
      public SimulatedActivity() { N = 0;}

      @Override
	  protected Integer doInBackground()	throws IOException
      {
         try {
	String file = "C:/SherlockHolmes.txt"; 		 // also: "C:\\SherlockHolmes.txt"
	 Scanner inp = new Scanner (new File(file));
            while(true) { 
		if(inp.hasNextLine()) {
	                 line = inp.nextLine(); 
		     N++;
		}
		else break;
            }
         }
         catch (IOException e) { }
		 return N;	
      }

      @Override
	  protected void done() {
         try {
	 textField.setText(Integer.toString(get()) + "\n"); 
	 startButton.setEnabled(true); 
         }
         catch (Exception e) {}
      }				// end of done()
   }				// end of SwingWorker   

}


