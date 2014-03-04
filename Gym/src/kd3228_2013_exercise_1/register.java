package kd3228_2013_exercise_1;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridLayout;

import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.border.TitledBorder;

import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ScrollPaneConstants;


public class register extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu mnNewMenu = new JMenu("Arkiv");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmBlash = new JMenuItem("Skriv ut");
		mnNewMenu.add(mntmBlash);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnNewMenu.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("");
		menuBar.add(mntmNewMenuItem);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblGrymmaFymme = new JLabel("  Grymma Gymmet");
		panel.add(lblGrymmaFymme, BorderLayout.NORTH);
		lblGrymmaFymme.setVerticalAlignment(SwingConstants.TOP);
		lblGrymmaFymme.setBackground(Color.WHITE);
		lblGrymmaFymme.setForeground(new Color(128, 0, 0));
		lblGrymmaFymme.setFont(new Font("Stencil", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);/*
		ImageIcon a_img = new ImageIcon("C:/Skola/Programmering för Interaktionsdesin n 2/Swingtest/src/Andreas.jpg");
		ImageIcon b_img = new ImageIcon("C:/Skola/Programmering för Interaktionsdesin n 2/Swingtest/src/Bengt.jpg");
		ImageIcon c_img = new ImageIcon("C:/Skola/Programmering för Interaktionsdesin n 2/Swingtest/src/Cecilia.jpg");
		ImageIcon d_img = new ImageIcon("C:/Skola/Programmering för Interaktionsdesin n 2/Swingtest/src/David.jpg");
		ImageIcon e_img = new ImageIcon("C:/Skola/Programmering för Interaktionsdesin n 2/Swingtest/src/Erika.jpg"); */
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" Anders Andesson", " 830214-1452", "Andersv\u00E4gen 3 123 12 Andersstad", " 0724-236587", " anders.andersson@mail.com",/* a_img*/},
				{" Bengt Bengtsson", " 420909-7636", "Bengtgatan 873 832 43 Bengtsn\u00E4s", " 0324-149652", " bengt.b@mail.com",/* b_img*/},
				{" Cecilia Cecil", " 731210-8752", " Ceciliasv\u00E4g 7 741 20 Ceciliastrand", " 0725-852716", " c.cecil@mail.com",/* c_img*/},
				{" David Davidsson", " 920201-3245", " Davidsmos 83 123 45 Davidsberg", " 0758-987563", " ddavid@mail.com", /*d_img*/},
				{" Erika Erikasdotter", " 900829-6953", " Erikasled 23 323 65 Erikaborg", "0751-455452", " erika.erikasdotter.90@mail.com",/* e_img*/},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Namn", "Personnummer", "Adress", "Telefon.nr", "E-Post", "Bild"
			}
		));
		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
		    protected void setValue(Object value) {
		        if( value instanceof ImageIcon ) {
		            setIcon((ImageIcon)value);
		            setText("");
		        } else {
		            setIcon(null);
		            super.setValue(value);
		        }
		    }
		});
       

		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
				.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 684, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE))
				.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		);
		JButton btnSpara = new JButton("Spara");
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnSpara, BorderLayout.SOUTH);
		contentPane.setLayout(groupLayout);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
