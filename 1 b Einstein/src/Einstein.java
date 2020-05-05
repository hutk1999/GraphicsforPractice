/*
<applet code="Einstein.class" width="300"  height="300">
</applet>
*/

import javax.swing.JApplet;
import java.awt.*;

public class Einstein extends JApplet
	{
	  	
		public void paint(Graphics page)
		{
			page.drawRect(50, 50, 40, 40);
			page.drawRect(60, 80, 225, 30);
			page.drawOval(75, 65, 20, 20);
			page.drawLine(35, 60, 100, 200);

			page.drawString("Out of clutter, find simplicity.", 110, 70);
			page.drawString("-- Albert Einstein ", 130, 100);
		}

	}