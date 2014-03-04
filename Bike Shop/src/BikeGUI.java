import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField color_Input;
	private JTextField price_Input;
	private JTextField size_Input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeGUI frame = new BikeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static BikeStore store;
	
	/**
	 * Create the frame.
	 */
	public BikeGUI() {
		store = new BikeStore();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 414, 134);
		contentPane.add(textArea);
				
		color_Input = new JTextField();
		color_Input.setBounds(11, 167, 131, 20);
		contentPane.add(color_Input);
		color_Input.setColumns(10);
		
		price_Input = new JTextField();
		price_Input.setBounds(293, 167, 131, 20);
		contentPane.add(price_Input);
		price_Input.setColumns(10);
		
		size_Input = new JTextField();
		size_Input.setBounds(152, 167, 131, 20);
		contentPane.add(size_Input);
		size_Input.setColumns(10);
		
		JButton Add = new JButton("Add");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				store.addBike(color_Input.getText(), size_Input.getText(), price_Input.getText());
				textArea.setText(store.getAllBikes());
			}
		});
		Add.setBounds(335, 228, 89, 23);
		contentPane.add(Add);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 152, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(152, 152, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(293, 152, 46, 14);
		contentPane.add(lblPrice);
	}
}
