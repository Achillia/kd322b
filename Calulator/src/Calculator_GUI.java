import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Calculator_GUI extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_GUI frame = new Calculator_GUI();
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
	public Calculator_GUI() {
		final Calculator calc = new Calculator();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JTextPane txtpn = new JTextPane();
		txtpn.setBounds(5, 5, 403, 70);
		contentPane.add(txtpn);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.setBounds(5, 75, 102, 70);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(1);
				txtpn.setText("1");
			}
		});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(107, 75, 102, 70);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(2);
				txtpn.setText("2");
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.setBounds(209, 75, 102, 70);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(3);
				txtpn.setText("3");
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(311, 75, 102, 70);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc.plus();
				txtpn.setText("+");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.setBounds(5, 145, 102, 70);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(4);
				txtpn.setText("4");
			}
		});
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setBounds(107, 145, 102, 70);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(5);
				txtpn.setText("5");
			}
		});
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.setBounds(209, 145, 102, 70);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(6);
				txtpn.setText("6");
			}
		});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("-");
		btnNewButton_8.setBounds(311, 145, 102, 70);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.minus();
				txtpn.setText("-");
			}
		});
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.setBounds(311, 215, 102, 70);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.mult();
				txtpn.setText("*");
			}
		});
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.setBounds(5, 215, 102, 70);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(7);
				txtpn.setText("7");
			}
		});
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.setBounds(107, 215, 102, 70);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(8);
				txtpn.setText("8");
			}
		});
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("9");
		btnNewButton_11.setBounds(209, 215, 102, 70);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(9);
				txtpn.setText("9");
			}
		});
		contentPane.add(btnNewButton_11);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("Clear");
		btnNewButton_14.setBounds(5, 285, 102, 70);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.clear();
				txtpn.setText("");
			}
		});
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.setBounds(209, 285, 102, 70);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.equals();
				txtpn.setText(calc.getResult() + "");
			}
		});
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.setBounds(107, 285, 102, 70);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc.numberButtonPressed(0);
				txtpn.setText("0");
			}
		});
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_13);
		
		JButton button = new JButton("/");
		button.setBounds(311, 285, 102, 70);
		contentPane.add(button);
	}
}
