package Observable;

import java.util.ArrayList;

import Observer.Observer;

public class HealthData implements Subject {
	
	ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	private double Height, Weight;
	private int Age;
	private String Gender, ActivityIndex;
	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
		
	}
	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
		
	}
	@Override
	public void notifyObservers() {
		for(int i = 0; i < observerList.size(); i++) {
			observerList.get(i).update(Weight, Height, Age, Gender, ActivityIndex);
		}
		
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(double Weight, double Height, int Age, String Gender, String ActivityIndex) {
		this.ActivityIndex = ActivityIndex;
		this.Age = Age;
		this.Gender = Gender;
		this.Height = Height;
		this.Weight = Weight;
		measurementsChanged();
	}
	
	

}
