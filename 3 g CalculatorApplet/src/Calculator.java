/*
<applet code="Calculator.class" width="300"  height="500">
</applet>
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Calculator extends javax.swing.JApplet {
    
    /** Creates a new instance of Calculator */
    public Calculator() {
    }
    public void init()
    {
        Container contentPane = getContentPane();
        CalculatorPanel panel = new CalculatorPanel();
        contentPane.add(panel);
    }
    }

