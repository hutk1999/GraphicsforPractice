

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TumbleItemPanel extends JPanel {

 	int loopslot = -1;           //the current frame number
    int pause = 3900;            //the length of the pause between revs
   	int offset = -57;            //how much to offset between loops
    int off;                     //the current offset
    int speed = 100;             //animation speed
    int nimgs  = 16;             //number of images to animate
    int width =  600;            //width of the applet's content pane
	boolean finishedLoading;

    	ImageIcon[] imgs = new ImageIcon[nimgs];          //the images
    	int maxWidth;                                     //width of widest image 
    	JLabel statusLabel;
				   InputWorker worker = new InputWorker();


	TumbleItemPanel() {
                   if (offset < 0)  off = width - maxWidth;
       			   setOpaque(true);
        	       setBackground(Color.white);
		           BorderLayout layout = new BorderLayout ();
        	       statusLabel = new JLabel("Loading Images...", JLabel.CENTER);
        	       add(statusLabel, BorderLayout.CENTER);
				   AListener listener = new AListener();
				   Timer timer = new Timer(speed, listener);
				   timer.addActionListener (listener); 
				   timer.setInitialDelay(pause);
			       timer.start();
				   if (loopslot == nimgs - 1) timer.restart();

				   //Start loading the images using the background worker.
		           worker.execute();
	}			   // end of constructor TumbleItemPanel()

				 
					private class AListener implements ActionListener  {
						public void actionPerformed (ActionEvent event) {
								//If still loading, can't animate.
								if (!worker.isDone()) return;
						        loopslot++;
								if (loopslot >= nimgs) {
									loopslot = 0;
									off += offset;
									if (off < 0) off = width - maxWidth;
				                    else if (off + maxWidth > width) off = 0;
							    }
								repaint();
						 }		 //END actionPerformed()
					}			// END class AListener
         

					public void paintComponent(Graphics g) {
					    super.paintComponent(g);
					    if (worker.isDone() && (loopslot > -1) && (loopslot < nimgs)) 
						     if (imgs != null && imgs[loopslot] != null) 
						         imgs[loopslot].paintIcon(this, g, off, 0);
                     }			 // END paintComponent()


	      class InputWorker extends SwingWorker<ImageIcon[], Void> {
				InputWorker() { }

        	     @Override
        	       public ImageIcon[] doInBackground() {
            		  final ImageIcon[] innerImgs = new ImageIcon[nimgs];
            		  for (int i = 0; i < nimgs; i++) {
				         String path = "images/T" + (i+1) + ".gif";
      	                 innerImgs[i] = new ImageIcon(path);
                	  }
                	  finishedLoading = true;
					  System.out.println("finished input of images"+ 
		                       Thread.currentThread()
					  );
                      return innerImgs;
            	      }		

        	      @Override
        	        public void done() {            
            	    removeAll();
            		loopslot = -1;
					try{ imgs = get(); System.out.println("after get()" + 
		                       Thread.currentThread()
					);}
					catch (Exception e) {};
            
        	      }
             }	// end SwingWorker

	 }		// end of class TumbleItemPanel
