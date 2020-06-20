package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import TER.TER;
import Controller.Controller1;

public class View1 extends JFrame {
	
	private JPanel contentPane;
	private JButton btnDiet, btnTraining, btnCalculateBMI, btnCalculateTER;
	private JTextPane gender, heightBMI, heightTER, weightBMI, weightTER, age, activity, resultBMI, resultTER;
	private JTextField txtHeightBMI;
	private static JTextField txtHeightTER;
	private JTextField txtWeightBMI;
	private static JTextField txtWeightTER;
	private static JTextField txtResultBMI;
	private static JTextField txtResultTER;
	private static JTextField txtAge;
	private JRadioButton radioButton;
	private static JRadioButton woman;
	private static JRadioButton man;
	private JLabel CalculatorBMI, CalculatorTER, text;
	private static JComboBox ActivityBox;
	private ButtonGroup GenderGroup;

	/**
	 * Create the frame.
	 */
	public View1() {
		super("FitApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(370, 280, 690, 337);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 238, 238));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		print();
	}
	
	public JTextPane getGender() {
		return gender;
	}
	
	public static JRadioButton getWoman() {
		return woman;
	}

	public static JRadioButton getMan() {
		return man;
	}

	public JButton getBtnCalculateBMI() {
		return btnCalculateBMI;
	}
	
	public JButton getBtnCalculateTER() {
		return btnCalculateTER;
	}

	public double getTxtHeightBMI() {
		return Double.parseDouble(txtHeightBMI.getText());
	}

	public double getTxtWeightBMI() {
		return Double.parseDouble(txtWeightBMI.getText());
	}

	public double getTxtResultBMI() {
		return Double.parseDouble(txtResultBMI.getText());
	}

	public static void setTxtResultBMI(double result) {
		txtResultBMI.setText((Double.toString(result)));
	}

	public static double getTxtResultTER() {
		return Double.parseDouble(txtResultTER.getText());
	}

	public static void setTxtResultTER(double result) {
		txtResultTER.setText((Double.toString(result)));
	}

	public static double getTxtHeightTER() {
		return Double.parseDouble(txtHeightTER.getText());
	}

	public static double getTxtWeightTER() {
		return Double.parseDouble(txtWeightTER.getText());
	}

	public static int getTxtAge() {
		return Integer.parseInt(txtAge.getText());
	}

	public static JComboBox getActivityBox() {
		return ActivityBox;
	}

	public void setActivityBox(JComboBox activityBox) {
		ActivityBox = activityBox;
	}
	
	public static void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(null, errorMessage);
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
		
		btnDiet = new JButton("Dieta");
		btnDiet.setIcon(new ImageIcon("/Users/aleksandragenerowicz/eclipse-workspace/FitApp/src/icons/icons8-orange.png"));
		btnDiet.setBackground(new Color(176, 224, 230));
		btnDiet.setBounds(10, 64, 107, 29);
		contentPane.add(btnDiet);
		btnDiet.addActionListener(new btnDietListener());
		
		btnTraining = new JButton("Trening");
		btnTraining.setIcon(new ImageIcon("/Users/aleksandragenerowicz/eclipse-workspace/App/src/icons8-dumbbell.png"));
		btnTraining.setBounds(10, 93, 107, 29);
		contentPane.add(btnTraining);
		btnTraining.addActionListener(new btnTrainingListener());

		p1.add(text);
		p1.add(btnDiet);
		p1.add(btnTraining);
		
		return p1;
	}
	
	private JPanel panel3() {
		JPanel p3 = new JPanel();
		p3.setBorder(null);
		p3.setBounds(150, 40, 180, 250);
		p3.setBackground(new Color(220, 220, 220));
		contentPane.add(p3);
		p3.setLayout(null);
		
		CalculatorBMI = new JLabel("Kalkulator BMI");
		CalculatorBMI.setBounds(44, 35, 110, 10);
		contentPane.add(CalculatorBMI);
		p3.add(CalculatorBMI);
		
		heightBMI = new JTextPane();
		heightBMI.setText(" Wzrost:");
		heightBMI.setBounds(11, 77, 60, 16);
		p3.add(heightBMI);
		
		weightBMI = new JTextPane();
		weightBMI.setText(" Waga:");
		weightBMI.setBounds(11, 109, 60, 16);
		p3.add(weightBMI);
		
		txtHeightBMI = new JTextField();
		txtHeightBMI.setText("");
		txtHeightBMI.setBounds(85, 77, 84, 16);
		p3.add(txtHeightBMI);
		
		txtWeightBMI = new JTextField();
		txtWeightBMI.setText("");
		txtWeightBMI.setBounds(85, 109, 84, 16);
		p3.add(txtWeightBMI);
		
		resultBMI = new JTextPane();
		resultBMI.setText(" Wynik");
		resultBMI.setBounds(11, 204, 60, 16);
		p3.add(resultBMI);
		
		txtResultBMI = new JTextField();
		txtResultBMI.setText("");
		txtResultBMI.setBounds(85, 204, 84, 16);
		p3.add(txtResultBMI);
		
		btnCalculateBMI = new JButton("Oblicz");
		btnCalculateBMI.setBackground(new Color(176, 224, 230));
		btnCalculateBMI.setBounds(180, 184, 127, 29);
		add(btnCalculateBMI);
		btnCalculateBMI.addActionListener(new btnCalculateBMIListener());
		
		return p3;
			
	}
	
	private JPanel panel4() {
		JPanel p4 = new JPanel();
		p4.setBorder(null);
		p4.setBounds(350, 40, 300, 250);
		p4.setBackground(new Color(220, 220, 220));
		//contentPane.add(p4);
		p4.setLayout(null);
		
		CalculatorTER = new JLabel("Kalkulator TER");
		CalculatorTER.setBounds(100, 20, 110, 10);
		//contentPane.add(CalculatorTER);
		p4.add(CalculatorTER);
		
		gender = new JTextPane();
		gender.setText(" Płeć: ");
		gender.setBounds(11, 46, 84, 16);
		p4.add(gender);
		
		woman = new JRadioButton("Kobieta ");
		woman.setBounds(100, 46, 84, 16);
		p4.add(woman);
		
		man = new JRadioButton("Mężczyzna");
		man.setBounds(176, 46, 133, 16);
		p4.add(man);
		
		GenderGroup = new ButtonGroup();
		GenderGroup.add(woman);
		GenderGroup.add(man);
		
		age = new JTextPane();
		age.setText(" Wiek:");
		age.setBounds(11, 67, 84, 16);
		p4.add(age);
		
		txtAge = new JFormattedTextField();
		txtAge.setText("");
		txtAge.setBounds(100, 67, 110, 16);
		p4.add(txtAge);
		
		heightTER = new JTextPane();
		heightTER.setText(" Wzrost:");
		heightTER.setBounds(11, 89, 84, 16);
		p4.add(heightTER);
		
		weightTER = new JTextPane();
		weightTER.setText(" Waga:");
		weightTER.setBounds(11, 111, 84, 16);
		p4.add(weightTER);
		
		txtHeightTER = new JFormattedTextField();
		txtHeightTER.setText("");
		txtHeightTER.setBounds(100, 89, 110, 16);
		p4.add(txtHeightTER);
		
		txtWeightTER = new JFormattedTextField();
		txtWeightTER.setText("");
		txtWeightTER.setBounds(100, 111, 110, 16);
		p4.add(txtWeightTER);
		
		activity = new JTextPane();
		activity.setText(" Aktywność:");
		activity.setBounds(11, 132, 84, 16);
		p4.add(activity);
		
		String[] options = {"Mała", "Średnia", "Duża"};
		ActivityBox = new JComboBox(options);
		ActivityBox.setMaximumRowCount(3);
		ActivityBox.setBounds(100, 132, 110, 20);
		p4.add(ActivityBox);
		
		btnCalculateTER = new JButton("Oblicz");
		btnCalculateTER.setBackground(new Color(176, 224, 230));
		btnCalculateTER.setBounds(440, 204, 127, 29);
		contentPane.add(btnCalculateTER);
		btnCalculateTER.addActionListener(new btnCalculateTERListener());
		
		resultTER = new JTextPane();
		resultTER.setText(" Wynik: ");
		resultTER.setBounds(11, 204, 84, 16);
		p4.add(resultTER);
		
		txtResultTER = new JTextField("");
		txtResultTER.setBounds(100, 204, 110, 16);
		p4.add(txtResultTER);
		
		return p4;
	}
	
	public void print() {
		JPanel panel1 = panel1();
		add(panel1);
		JPanel panel3 = panel3();
		add(panel3);
		JPanel panel4 = panel4();
		add(panel4);
		
		
	}
	
	class btnCalculateBMIListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
			Controller1.setWeightFromView(getTxtWeightBMI());
			Controller1.setHeightFromView(getTxtHeightBMI());
			} catch (NumberFormatException ex) {
				View1.displayErrorMessage("You need to enter a right format!");
			}
		}
		
		
	}
	
	class btnCalculateTERListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
			Controller1.setAgeFromView(getTxtAge());
			Controller1.setHeightFromView(getTxtHeightTER());
			Controller1.setWeightFromView(getTxtWeightTER());
			} catch (NumberFormatException ex) {
				View1.displayErrorMessage("You need to enter a right format!");
			}
		}
	}
	
	class btnDietListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				new View2();
				if(View2.getStylesBox().getSelectedItem().toString().equals("Dieta Wegetariańska"))
					View2.displayMessage(TER.ExampleVegetarianDiet(View2.getEnergyTERText()));
				else if (View2.getStylesBox().getSelectedItem().toString().equals("Dieta Mięsna"))
					View2.displayMessage(TER.ExampleMeatDiet(View2.getEnergyTERText()));
				} catch (NumberFormatException ex) {
					View2.displayMessage("You need to enter a right format");
				}
		}
	}
	
	class btnTrainingListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				TER.showCommunicate(View1.getTxtResultTER());
				View1.displayErrorMessage(TER.showCommunicate(View1.getTxtResultTER()));
				} catch (NumberFormatException ex) {
					View1.displayErrorMessage("You need to enter the data!");
				}
			
		}
		
		
	}

}
