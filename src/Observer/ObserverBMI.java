package Observer;

import Controller.Controller1;
import Observable.Subject;
import View.View1;

public class ObserverBMI  implements Observer {
	
	private double Weight, Height, Result;
	private Subject sub;
	
	public ObserverBMI(Subject sub) {
		this.sub = sub;
		this.sub.registerObserver(this);
		Controller1.setObserverBMIcode(this.hashCode());
	}

	@Override
	public void update(double Weight, double Height, int Age, String Gender, String ActivityIndex) {
		this.Weight = Weight;
		this.Height = Height;
		
		if(countBMI() > 0 ) {
			Controller1.setDataFromModel(Result, this.hashCode());
			
		}
	}
	
	public double countBMI() {
		return Result = Math.round(Weight / (Height * Height));
	
	}
	

}
