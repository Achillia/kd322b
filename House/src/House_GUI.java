import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class House_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					House_GUI frame = new House_GUI();
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
	public House_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		
		House mHouse = new House(2001, 256);
		House jHouse = new House(2010, 128);
		House cHouse = new House(1973, 290);
		
		House[] houseArray = new House[House.MIN_SIZE]; 
		houseArray[0] = mHouse;
		houseArray[1] = jHouse;
		houseArray[2] = cHouse;
		
		String outputString = "";
		
		for(int i = 0; i < 3; i++){
			outputString += "Ett hus byggt " + houseArray[i].getYear() + " som är " + houseArray[i].getSize() + " kvm stort.\n" ;
		}
		
		textArea.setText(outputString + "\nDet finns totalt: " + House.getNbrHouses() + " stycken hus");
		
	}

}
