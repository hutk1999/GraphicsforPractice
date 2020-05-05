import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * A frame with a calculator panel.
 */
class CalculatorFrame extends JFrame
{
   public CalculatorFrame()
   {
      setTitle("Calculator");
      CalculatorPanel panel = new CalculatorPanel();
      add(panel);
      pack();
   }
}
