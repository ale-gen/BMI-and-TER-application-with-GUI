package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import TER.TER;

public class View2 extends JFrame {
	
	private JPanel contentPane;
	private JButton btnCalculators, btnTraining, btnShow;
	private JTextPane indicatorBMI, energyTER, nutritions;
	private JTextField nameText;
	private static JTextField energyTERText;
	private JRadioButton radioButton, woman, man;
	private JLabel text, dietsCreator;
	private static JComboBox StylesBox;


	/**
	 * Create the frame.
	 */
	public View2() {
		super("FitApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(370, 280, 690, 337);
		setVisible(true);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 238, 238));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		print();
	}

	private JPanel panel1() {
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(176, 224, 230));
		p1.setBounds(0, 0, 127, 337);
		contentPane.add(p1);
		p1.setLayout(null);
		
		text = new JLabel("KeepFit");
		text.setBounds(20, 10, 100, 40);
		text.setSize(100, 40);
		text.setIcon(new ImageIcon("/Users/aleksandragenerowicz/eclipse-workspace/FitApp/src/icons/icons8-body_measurements.png"));
		contentPane.add(text);
		
		btnCalculators = new JButton("Kalkulatory");
		btnCalculators.setIcon(new ImageIcon("/Users/aleksandragenerowicz/eclipse-workspace/FitApp/src/icons/icons8-calculator.png"));
		btnCalculators.setBackground(new Color(176, 224, 230));
		btnCalculators.setBounds(10, 64, 107, 35);
		contentPane.add(btnCalculators);
		btnCalculators.addActionListener(new btnCalculatorsListener());
		
		btnTraining = new JButton("Trening");
		btnTraining.setIcon(new ImageIcon("/Users/aleksandragenerowicz/eclipse-workspace/App/src/icons8-dumbbell.png"));
		btnTraining.setBounds(10, 103, 107, 35);
		contentPane.add(btnTraining);
		btnTraining.addActionListener(new btnTrainingListener());
	
		p1.add(text);
		p1.add(btnCalculators);
		p1.add(btnTraining);
		
		return p1;
	}
	
	private JPanel panel3() {
		JPanel p3 = new JPanel();
		p3.setBorder(null);
		p3.setBounds(150, 40, 480, 250);
		p3.setBackground(new Color(220, 220, 220));
		contentPane.add(p3);
		p3.setLayout(null);
		
		dietsCreator = new JLabel("Kreator Diet: ");
		dietsCreator.setBounds(190, 30, 120, 24);
		p3.add(dietsCreator);
		
		indicatorBMI = new JTextPane();
		indicatorBMI.setText(" Wskażnik BMI: ");
		indicatorBMI.setBounds(11, 77, 140, 16);
		p3.add(indicatorBMI);
		
		nameText = new JTextField();
		nameText.setText("");
		nameText.setBounds(155, 77, 124, 16);
		p3.add(nameText);
		
		energyTER = new JTextPane();
		energyTER.setText(" Wskaźnik TER: ");
		energyTER.setBounds(11, 109, 140, 16);
		p3.add(energyTER);
		
		energyTERText = new JTextField();
		energyTERText.setText("");
		energyTERText.setBounds(155, 109, 124, 16);
		p3.add(energyTERText);
		
		nutritions = new JTextPane();
		nutritions.setText(" Sposób odżywiania: ");
		nutritions.setBounds(11, 142, 140, 16);
		p3.add(nutritions);
		
		StylesBox = new JComboBox();
		StylesBox.setMaximumRowCount(4);
		StylesBox.setBounds(155, 142, 184, 20);
		StylesBox.addItem("Dieta Wegetariańska");
		StylesBox.addItem("Dieta Mięsna");
		p3.add(StylesBox);
		
		btnShow = new JButton("Pokaż");
		btnShow.setBackground(new Color(176, 224, 230));
		btnShow.setBounds(180, 185, 100, 20);
		p3.add(btnShow);
		btnShow.addActionListener(new ShowDiets());
		
		return p3;
			
	}
	
	public void print() {
		JPanel panel1 = panel1();
		add(panel1);
		JPanel panel3 = panel3();
		add(panel3);
		
		
	}
	
	public static JComboBox getStylesBox() {
		return StylesBox;
	}

	public static double getEnergyTERText() {
		return Double.parseDouble(energyTERText.getText());
	}

	public void setEnergyTERText(JTextField energyTERText) {
		this.energyTERText = energyTERText;
	}
	
	public static void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	class ShowDiets implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				
				if(View2.getStylesBox().getSelectedItem().toString().equals("Dieta Wegetariańska"))
					View2.displayMessage(TER.ExampleVegetarianDiet(View2.getEnergyTERText()));
				else if (View2.getStylesBox().getSelectedItem().toString().equals("Dieta Mięsna"))
					View2.displayMessage(TER.ExampleMeatDiet(View2.getEnergyTERText()));
			
			} catch (NumberFormatException ex) {
				View2.displayMessage("You need to enter the data!");
			}
			
		}
		
	}
	
	class btnCalculatorsListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent  e) {
			try {
			new View1();
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	class btnTrainingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				TER.showCommunicate(View2.getEnergyTERText());
				View2.displayMessage(TER.showCommunicate(View2.getEnergyTERText()));
				} catch (NumberFormatException ex) {
					View2.displayMessage("You need to enter the data!");
				}
			
		}
		
		
	}

}
