/*
<applet code="RandomArtApplet.class" width="300"  height="300">
</applet>
*/

import javax.swing.JApplet;

/**
 * This applet shows a RandomArtPanel as its content pane.  The panel shows
 * a new random drawing every four seconds.  The program ends when the user
 * closes the window.
 *
*/

public class RandomArtApplet extends JApplet {

   public void init() {
      setContentPane( new RandomArtPanel() );
   }

}

