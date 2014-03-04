package kd3228_2013_exercise_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class detaljvy extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtAndreasAndresson;
	private JTextField txtAndersvgen;
	private JTextField textField_1;
	private JTextField txtAndersanderssonmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detaljvy frame = new detaljvy();
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
	public detaljvy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Skriv Ut");
		mnArkiv.add(mntmNewMenuItem);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("Medlemmar");
		menuBar.add(mnMedlemmar);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlemmar.add(mntmNyMedlem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Hitta medlem");
		mnMedlemmar.add(mntmNewMenuItem_1);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(5, 5, 424, 24);
		contentPane.add(panel);
		
		JLabel lblDetaljvy = new JLabel("Detaljvy");
		panel.add(lblDetaljvy);
		lblDetaljvy.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(297, 29, 132, 206);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Skola\\Programmering f\u00F6r Interaktionsdesin n 2\\kd3228_2013_exercise_1\\src\\images\\Andreas.jpg"));
		
		JList list = new JList();
		list.setBounds(5, 29, 74, 206);
		contentPane.add(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Namn: ", "", "", "", "", "", "", "", "Personnr: ", "", "", "", "", "", "", "", "", "", "", "Adress: ", "", "", "", "", "", "", "", "", "Telefonnr: ", "", "", "", "", "", "", "", "", "E-Post: "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(81, 29, 218, 206);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtAndreasAndresson = new JTextField();
		txtAndreasAndresson.setBounds(10, 0, 165, 20);
		txtAndreasAndresson.setText("Andreas Andresson");
		panel_1.add(txtAndreasAndresson);
		txtAndreasAndresson.setColumns(10);
		
		txtA = new JTextField();
		txtA.setBounds(10, 31, 165, 20);
		txtA.setText("830214-1452");
		panel_1.add(txtA);
		txtA.setColumns(10);
		
		txtAndersvgen = new JTextField();
		txtAndersvgen.setText("Andersv\u00E4gen 3\r\n123 12 Andersstad");
		txtAndersvgen.setBounds(10, 62, 165, 20);
		panel_1.add(txtAndersvgen);
		txtAndersvgen.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0724-236587");
		textField_1.setBounds(10, 93, 165, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		txtAndersanderssonmailcom = new JTextField();
		txtAndersanderssonmailcom.setText("anders.andersson@mail.com");
		txtAndersanderssonmailcom.setBounds(10, 124, 165, 20);
		panel_1.add(txtAndersanderssonmailcom);
		txtAndersanderssonmailcom.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(329, 206, 89, 23);
		contentPane.add(btnSpara);
		
	}
}
