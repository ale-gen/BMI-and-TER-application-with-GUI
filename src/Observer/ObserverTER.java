package Observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.Controller1;
import Observable.Subject;
import TER.TER;
import View.View1;
import View.View2;

public class ObserverTER extends TER implements Observer {
	
	private double Weight, Height, Result;
	private int Age;
	private String Gender, ActivityIndex;
	private Subject sub;
	
	public ObserverTER(Subject sub) {
		this.sub = sub;
		this.sub.registerObserver(this);
		Controller1.setObserverTERcode(this.hashCode());
	}

	@Override
	public void update(double Weight, double Height, int Age, String Gender, String ActivityIndex) {
		this.Weight = Weight;
		this.Height = Height;
		this.ActivityIndex = ActivityIndex;
		this.Age = Age;
		this.Gender = Gender;
		
		if(countTER() > 0) {
			Controller1.setDataFromModel(Result, this.hashCode());
		}
			
		
	}
	
	public double countTER() {
		if(View1.getActivityBox().getSelectedItem().equals("Mała")) {
			
			return countTERLowActivity();
		}
		else if (View1.getActivityBox().getSelectedItem().equals("Średnia")) {
			return countTERMiddleActivity();
		}
		else {
			return countTERHighActivity();
		}	
	}
	
	public double countTERLowActivity() {
		
		double result = 0; 
			
			try {
			if (View1.getWoman().isSelected()) {
				result = ((9.99 * View1.getTxtWeightTER()) + (625 * View1.getTxtHeightTER())
						- (4.92 * View1.getTxtAge()) - 161);
			}
			else if (View1.getMan().isSelected()) {
				result = ((9.99 * View1.getTxtWeightTER()) + (625 * View1.getTxtHeightTER()) 
						- (4.92 * View1.getTxtAge()) + 5);
			}
			Result = Math.round((result * 0.1 * 1.3) + (result * 1.3));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
				View1.displayErrorMessage("You need to enter a right format");
			}
			return Result;
	}
	
	public double countTERMiddleActivity() {
		
		double result = 0;
		
		try {
		if (View1.getWoman().isSelected()) {
			result = ((9.99 * View1.getTxtWeightTER()) + (625 * View1.getTxtHeightTER()) 
					- (4.92 * View1.getTxtAge()) - 161);
		}
		else if (View1.getMan().isSelected()) {
			result = ((9.99 * View1.getTxtWeightTER()) + (625 * View1.getTxtHeightTER()) 
					- (4.92 * View1.getTxtAge()) + 5);
		}
		Result = Math.round((result * 0.1 * 1.5) + (result * 1.5));
		} catch (NumberFormatException ex) {
			View1.displayErrorMessage("You need to enter a right format");
		}
		return Result;
	}
	
	public double countTERHighActivity() {
		
		double result = 0;
		
		try {
		if (View1.getWoman().isSelected()) {
			result = ((9.99 * View1.getTxtWeightTER() + (625 * View1.getTxtHeightTER()) 
					- (4.92 * View1.getTxtAge())) - 161);
		}
		else if (View1.getMan().isSelected()) {
			result = ((9.99 * View1.getTxtWeightTER()) + (625 * View1.getTxtHeightTER()) 
					- (4.92 * View1.getTxtAge()) + 5);
		}
		Result = Math.round((result * 0.1 * 1.9) + (result * 1.9));
		} catch (NumberFormatException ex) {
			View1.displayErrorMessage("You need to enter a right format");
		}
		return Result;
	}
	
	/*public int doAnalyse() {
		if (View2.getStylesBox().getSelectedItem().toString().equals("Dieta Wegetariańska")) {
			this.chooseDiet(Result);
			return 1;
		}
			else if (View2.getStylesBox().getSelectedItem().toString().equals("Dieta Mięsna")) 
				return 0;
		return -1;
			
		
	}*/
	

	
	
	

}
