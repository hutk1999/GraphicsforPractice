import java.awt.*;
import javax.swing.*;

	public class PicPanel extends JPanel  {
		  ImageIcon world, everest, goat;
		  int MIN = 20;  // smallest picture size
		  int Screen_WIDTH = 320;
		  int Screen_HEIGHT = 320;
	   
		  public PicPanel(){
		  	  world = new ImageIcon("world.gif");
		      everest = new ImageIcon("everest.gif");
		      goat = new ImageIcon("goat.gif");
		      setPreferredSize (new Dimension(Screen_WIDTH, Screen_HEIGHT));
		  }

	   //  Draws the three images, then calls itself recursively.
	   
	      public void drawPictures (int size, Graphics page) {
		   System.out.println("HiHiHi2  " + size);
	      page.drawImage (everest.getImage(), 0, size/2, size/2, size/2, this);
	      page.drawImage (goat.getImage(), size/2, 0, size/2, size/2, this);
	      page.drawImage (world.getImage(), size/2, size/2, size/2, size/2, this);

	      if (size > MIN)
	         drawPictures (size/2, page);
	   } 

	   
	   //  Performs the initial call to the drawPictures method.
	   
	   public void paintComponent (Graphics page)  {
		   super.paintComponent(page);
	       drawPictures(Screen_WIDTH, page);
	   }
	}
	   
	
