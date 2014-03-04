import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Diagram_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagram_GUI frame = new Diagram_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	XML doc;
	private Bargraph bargraph = new Bargraph();
	private JLabel lbl_NameOutput = new JLabel("");
	private JComboBox comboBox = new JComboBox();
	private JLabel lbl_CodeOutput = new JLabel("");
	private JLabel lbl_totalValue = new JLabel("");
	private JLabel lbl_Total = new JLabel("Total:");
	
	/**
	 * Create the frame.
	 */
	public Diagram_GUI() {
		doc =  new XML("src/XML/ht2013_antagning.xml");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 299);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_details = new JPanel();
		panel_details.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_details.setBounds(5, 36, 424, 51);
		contentPane.add(panel_details);
		panel_details.setLayout(null);
		
		JLabel lbl_Name = new JLabel("Name:");
		lbl_Name.setBounds(10, 11, 46, 14);
		panel_details.add(lbl_Name);
		
		JLabel lbl_Code = new JLabel("Code:");
		lbl_Code.setBounds(10, 26, 46, 14);
		panel_details.add(lbl_Code);
		
		
		lbl_NameOutput.setBounds(66, 11, 348, 14);
		panel_details.add(lbl_NameOutput);
		
		lbl_CodeOutput.setBounds(66, 26, 348, 14);
		panel_details.add(lbl_CodeOutput);
		
		lbl_totalValue.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl_totalValue.setBounds(40, 85, 97, 20);
		contentPane.add(lbl_totalValue);
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Program pSelected = (Program)comboBox.getSelectedItem();
				lbl_NameOutput.setText(pSelected.getName());
				lbl_CodeOutput.setText(pSelected.getCode());
				lbl_totalValue.setText(Integer.toString((pSelected.getWomen() + pSelected.getMen())));
				bargraph.updateValues(pSelected.getWomen(), pSelected.getMen());
			}
		});
		
		comboBox.setBounds(5, 11, 424, 20);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(doc.getProgramsList().toArray()));
		
		bargraph.setBounds(95, 105, 250, 145);
		contentPane.add(bargraph);
		
		lbl_Total.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl_Total.setBounds(10, 80, 30, 30);
		contentPane.add(lbl_Total);
		
		
				
		

		
	}
}
