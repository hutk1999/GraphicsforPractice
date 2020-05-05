import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



 
public class CalculatorPanel extends JPanel {
    
    /** Creates a new instance of CalculatorPanel */
    public CalculatorPanel() {
        setLayout(new BorderLayout());
        
        result = 0;
        lastCommand = "=";
        start = true;
        
        // add display
        
        display = new JLabel("Initialization to 0");
        add(display, BorderLayout.NORTH);

        // If no components are added to one or more of the areas, that area
        // does not take up any space. We have put a label in NORTH.
        
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();


        // Now we put the calculator buttons in a panel in CENTER        
        // add buttons in a 4 x 4 grid   
        // addButton is a function defined below 
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        
        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);
        
        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);
        
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);
        
        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);
        
        add(panel, BorderLayout.CENTER);
    }
    
    // Definition of addButton, which adds a button to the center panel:
    
    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);

        // parameter listener is either insert or command defined below

        button.addActionListener(listener);
        panel.add(button);
    }
    
    //insertion of button action string at end of display text
    
    private class InsertAction implements ActionListener {

       // Only one method: actionPerformed defined in the interface

        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText(" ");      // erases previous text
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }
    
    // execution of command denoted by button action string
    
    private class CommandAction implements ActionListener {

    // Only one method: actionPerformed defined in the interface

        public void actionPerformed(ActionEvent evt) {
            String command = evt.getActionCommand();
            if(start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                }
                else lastCommand = command;
            }
            else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;                                  // ready for a new calculation
            }
        }
    }
    
    // carries out the pending calculation
    
    public void calculate(double x) {
        if (lastCommand.equals ("+")) result += x;
        else if (lastCommand.equals ("-")) result -= x;
        else if (lastCommand.equals ("*")) result *= x;
        else if (lastCommand.equals ("/")) result /= x;
        else if (lastCommand.equals ("=")) result = x;
        display.setText(" " + result);
    
            }
    private JLabel display;
    private JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;
        }
   