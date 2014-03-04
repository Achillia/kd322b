import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import java.awt.Component;

import javax.swing.Box;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AnimalsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField Human_textField;
	private JTextField Dog_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static Human human;
	/**
	 * Create the frame.
	 */
	public AnimalsGUI() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnimals = new JLabel("Animals");
		lblAnimals.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnimals.setBounds(10, 11, 142, 20);
		contentPane.add(lblAnimals);
		
		Human_textField = new JTextField();
		Human_textField.setBounds(10, 64, 128, 20);
		contentPane.add(Human_textField);
		Human_textField.setColumns(10);
		
		JButton btnHuman = new JButton("Human");
		
		btnHuman.setBounds(148, 63, 89, 23);
		contentPane.add(btnHuman);
		
		Dog_textField = new JTextField();
		Dog_textField.setBounds(10, 98, 128, 20);
		contentPane.add(Dog_textField);
		Dog_textField.setColumns(10);
		
		JButton btnDog = new JButton("Dog");
		btnDog.setBounds(148, 97, 89, 23);
		contentPane.add(btnDog);
		
		final JTextPane textPane_info = new JTextPane();
		textPane_info.setBounds(10, 203, 334, 38);
		contentPane.add(textPane_info);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(10, 185, 46, 14);
		contentPane.add(lblInfo);
		
		final JTextPane textPane_error = new JTextPane();
		textPane_error.setBounds(10, 277, 334, 20);
		contentPane.add(textPane_error);
		
		JLabel lblErrormessage = new JLabel("ErrorMessage");
		lblErrormessage.setBounds(10, 260, 101, 14);
		contentPane.add(lblErrormessage);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_info.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(148, 131, 89, 23);
		contentPane.add(btnPrintInfo);
		
		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Human_textField.getText().length() < Human.MIN_LETTERS){
					textPane_error.setText(Human_textField.getText() + " is too short");
				}
				else{
				human = new Human(Human_textField.getText());
				textPane_info.setText(human.getName() + " added");
				}
			}
		});

		btnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (human == null){
					textPane_error.setText("No human present");
				}
				else{
					Dog newDog = new Dog(Dog_textField.getText());
					human.buyDog(newDog);  
					textPane_info.setText(newDog.getName() + " added");
				}
			}
		});
	}
}
