import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Output_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Output_GUI frame = new Output_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	XMLDocument doc;

	/**
	 * Create the frame.
	 */
	public Output_GUI() {
		doc =  new XMLDocument("src/XML/ht2013_antagning.xml");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PrintInfo = new JLabel("");
		PrintInfo.setBounds(10, 11, 414, 26);
		contentPane.add(PrintInfo);
		PrintInfo.setText("First Element(Root): " + doc.getRoot());
		
		JLabel Program = new JLabel("");
		Program.setBounds(10, 34, 414, 26);
		contentPane.add(Program);
		Program.setText("Amounts of Programmes: " + doc.getProgramsList().size());
		
		final JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(10, 71, 414, 26);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(doc.getProgramsList().toArray()));
		
		JLabel Namn_Label = new JLabel("Name:");
		Namn_Label.setBounds(10, 151, 98, 14);
		contentPane.add(Namn_Label);
		
		JLabel Code_Label = new JLabel("Code:");
		Code_Label.setBounds(10, 176, 98, 14);
		contentPane.add(Code_Label);
		
		JLabel ApplyingW_Label = new JLabel("Applying (Women):");
		ApplyingW_Label.setBounds(10, 201, 98, 14);
		contentPane.add(ApplyingW_Label);
		
		JLabel ApplyingM_Label = new JLabel("Applying (Men):");
		ApplyingM_Label.setBounds(10, 226, 98, 13);
		contentPane.add(ApplyingM_Label);
		
		final JLabel NameValue_Label = new JLabel("");
		NameValue_Label.setBounds(118, 151, 306, 14);
		contentPane.add(NameValue_Label);
		
		final JLabel CodeValue_Label = new JLabel("");
		CodeValue_Label.setBounds(118, 176, 306, 14);
		contentPane.add(CodeValue_Label);
		
		final JLabel ApplyingWValue_Label = new JLabel("");
		ApplyingWValue_Label.setBounds(118, 201, 306, 14);
		contentPane.add(ApplyingWValue_Label);
		
		final JLabel ApplyingMValue_Label = new JLabel("");
		ApplyingMValue_Label.setBounds(118, 225, 306, 14);
		contentPane.add(ApplyingMValue_Label);
		
		JLabel Details_Label = new JLabel("Details:");
		Details_Label.setFont(new Font("Tahoma", Font.BOLD, 11));
		Details_Label.setBounds(10, 126, 46, 14);
		contentPane.add(Details_Label);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Program pSelected = (Program)comboBox.getSelectedItem();
				NameValue_Label.setText(pSelected.getName());
				CodeValue_Label.setText(pSelected.getCode());
				ApplyingWValue_Label.setText(Integer.toString(pSelected.getWomen()));
				ApplyingMValue_Label.setText(Integer.toString(pSelected.getMen()));
			}
		});
	}
}
