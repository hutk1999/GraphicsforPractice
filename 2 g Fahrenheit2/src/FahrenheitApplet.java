/*
<applet code="FahrenheitApplet.class" width="300"  height="300">
</applet>
*/


import javax.swing.*;

   public class FahrenheitApplet extends JApplet
   {
	
      	public void init() {
		getContentPane().add(new Fahrenheit1Panel());
		
        }
}
