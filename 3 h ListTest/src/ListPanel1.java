import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
* This panel contains a word list and a label that shows a sentence    
* made up from the chosen words.
* Note that you can select multiple words with Ctrl+click and  
* Shift+click.
*/

class ListPanel1 extends JPanel
{
   	public ListPanel1()
	{
	
	setBackground(Color.blue);
	this.setLayout (new BorderLayout());

	// Create scrollPane:
	setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	String[] words = { "quick", "brown", "hungry", "wild",    
                        "silent", "huge", "private", "abstract", "static", "final" };
	wordList = new JList(words);
	wordList.setVisibleRowCount(4);
	JScrollPane scrollPane = new JScrollPane(wordList);

	//Add scrollPane to subpanel named listPanel:
	listPanel = new JPanel();
	listPanel.add(scrollPane);

	//Define an anonymous ListSelectionListener: 
	wordList.addListSelectionListener(new ListSelectionListener() {
		public void valueChanged(ListSelectionEvent event) {	        
		         Object[] values = wordList.getSelectedValues();               			   
				 
				 //StringBuilder is efficient for building strings:
				 //but it is not thread-safe (use StringBuffer in parallel aaplications)
				 StringBuilder text = new StringBuilder(prefix);
		         for (int i = 0; i < values.length; i++)
   			     {
			        String word = (String) values[i];
                    text.append(word);                   
			        text.append(" ");
		          }
		          text.append(suffix);
		          label.setText(text.toString());
                                    }
	         });

    //Define subpanel for the radiobuttons:
	buttonPanel = new JPanel();
	group = new ButtonGroup();
	makeButton("Vertical", JList.VERTICAL);
	makeButton("Vertical Wrap", JList.VERTICAL_WRAP);
    makeButton("Horizontal Wrap", JList.HORIZONTAL_WRAP);   
   	add(listPanel, BorderLayout.NORTH);
	label = new JLabel(prefix + suffix);
	add(label, BorderLayout.CENTER);
	add(buttonPanel, BorderLayout.SOUTH);
	}
 
/** 
* Makes a radio button to set the layout orientation.
* @param label the button label
* @param orientation the orientation for the list
*/
	private void makeButton(String label, final int orientation)
	{
		JRadioButton button = new JRadioButton(label);
      	buttonPanel.add(button);
		if (group.getButtonCount() == 0) 			
			button.setSelected(true);
      		group.add(button);
		button.addActionListener(new ActionListener()
		{
		       public void actionPerformed(ActionEvent event) {
		 			wordList.setLayoutOrientation(orientation);
              		listPanel.revalidate();
		        }
		});
	}
   
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 300;
	private JPanel listPanel;
	private JList wordList;
	private JLabel label;
	private JPanel buttonPanel;
	private ButtonGroup group;
	private String prefix = "The ";
	private String suffix = "fox jumps over the lazy dog.";
}
