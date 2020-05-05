/*
<applet code="TumbleItem.class" width="600"  height="300">
</applet>
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedInputStream;

public class TumbleItem extends JApplet {
        public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
	            TumbleItemPanel panel = new TumbleItemPanel();
                }
            });
        } catch (Exception e) { 
            System.err.println("createGUI didn't successfully complete");
        }
        getContentPane().add(new TumbleItemPanel());
        }
}

