import javax.swing.JFrame;

public class LeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      JFrame frame = new JFrame ("Left Right");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().add(new LeftRightPanel());
	      frame.pack();
	      frame.setVisible(true);
	   }

	}


