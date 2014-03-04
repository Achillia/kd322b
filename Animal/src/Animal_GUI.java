import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Animal_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animal_GUI frame = new Animal_GUI();
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
	public Animal_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblAnimallist = new JLabel("Animallist");
		lblAnimallist.setBounds(10, 11, 98, 14);
		panel.add(lblAnimallist);
		
		JTextArea Text_Area = new JTextArea();
		
		Text_Area.setBounds(10, 36, 484, 205);
		panel.add(Text_Area);
		
		
		Dog Animal1 = new Dog("Siberian Husky", 8, 60);
		Cat Animal2 = new Cat("Scottish Fold", 8, true);
		Snake Animal3 = new Snake("Angolan python", false);
		Dog Animal4 = new Dog("Greyhound", 8, 30);
		Snake Animal5 = new Snake("Common krait", true);
		
		ArrayList<Animal> listOfAnimals =  new ArrayList<Animal>();
		listOfAnimals.add(Animal1);
		listOfAnimals.add(Animal2);
		listOfAnimals.add(Animal3);
		listOfAnimals.add(Animal4);
		listOfAnimals.add(Animal5);
		
		String text = "";
		for (int i = 0; i < listOfAnimals.size(); i++){
			Animal currentAnimal = listOfAnimals.get(i);
			text = text + currentAnimal.getInfo() + "\n";
			
		}
		Text_Area.setText(text);
		
	}
}
