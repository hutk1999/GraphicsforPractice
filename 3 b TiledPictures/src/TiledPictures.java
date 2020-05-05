import java.awt.*;
import javax.swing.*;

public class TiledPictures {

	public static void main(String[] args) {
		 final int Screen_WIDTH = 320;
		 final int Screen_HEIGHT = 320;
		 JFrame frame = new JFrame ("Tiled Pictures");
	      	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      	PicPanel tiles = new PicPanel();
	      	tiles.setBackground (Color.yellow);
	     	tiles.setPreferredSize (new Dimension(Screen_WIDTH, Screen_HEIGHT));     
			frame.getContentPane().add(tiles);
	     	frame.pack();
	     	frame.setVisible(true);	
	}
}
		   
		
