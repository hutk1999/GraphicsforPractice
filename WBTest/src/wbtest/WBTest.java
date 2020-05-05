package wbtest;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WBTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Fahrenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBTest frame = new WBTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WBTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel inputLabel = new JLabel("Give Fahrenheit Temperature");
		inputLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		inputLabel.setBounds(48, 51, 163, 14);
		contentPane.add(inputLabel);
		
		JLabel outputLabel = new JLabel("Celsius Temperature");
		outputLabel.setBounds(48, 100, 129, 14);
		contentPane.add(outputLabel);
		
		final JLabel resultLabel = new JLabel("---");
		resultLabel.setBounds(262, 100, 46, 14);
		contentPane.add(resultLabel);
		
		Fahrenheit = new JTextField();
		Fahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		         int FahrenheitTemp, celsiusTemp;

		         String text = Fahrenheit.getText();

		         FahrenheitTemp = Integer.parseInt (text);
		         celsiusTemp = (FahrenheitTemp-32) * 5/9;

		         resultLabel.setText (Integer.toString (celsiusTemp));

			}
		});
		Fahrenheit.setBounds(262, 48, 86, 20);
		contentPane.add(Fahrenheit);
		Fahrenheit.setColumns(10);
	}
}
