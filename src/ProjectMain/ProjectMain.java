package ProjectMain;

import Controller.Controller1;
import Observable.HealthData;
import Observer.ObserverBMI;
import Observer.ObserverTER;
import View.View1;

public class ProjectMain {
	
	public static void main(String[] args) {
		View1 view1 = new View1();
		view1.setVisible(true);
		
		HealthData healthData = new HealthData();
		Controller1.setHealthData(healthData);
		
		ObserverBMI bmi = new ObserverBMI(healthData);
		ObserverTER ter = new ObserverTER(healthData);
	}

}
