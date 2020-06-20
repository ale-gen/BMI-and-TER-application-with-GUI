package Controller;

import Observable.HealthData;
import View.View1;

public class Controller1 {
	
	private static HealthData healthData;
	
	private static int ObserverBMIcode;
	private static int ObserverTERcode;
	
	private static double Weight, Height;
	private static int Age;
	private static String Gender, ActivityIndex;
	
	public static void setHealthData(HealthData h) {
		healthData = h;
	}
	
	public static void setObserverBMIcode(int code) {
		ObserverBMIcode = code;
	}
	
	public static void setObserverTERcode(int code) {
		ObserverTERcode = code;
	}
	
	public static void putDataToModel() {
		healthData.setMeasurements(Weight, Height, Age, Gender, ActivityIndex);
	}
	
	public static void setWeightFromView(double weight) {
		if(weight > 0) {
			Weight = weight;
			
			putDataToModel();
		}
		else 
			Weight = 0;
	}
	
	public static void setHeightFromView(double height) {
		if(height > 0) {
			Height = height;
			
			putDataToModel();
		}
		else 
			Height = 0;
	}
	
	public static void setAgeFromView(int age) {
		if(age > 0) {
			Age = age;
			
			putDataToModel();
		}
		else 
			Age = 0;
	}
	
	public static void setGenderFromView(String gender) {
		if(gender.equals(Gender)) {
			Gender = gender;
			
			putDataToModel();
		}
		else 
			Gender = null;
	}
	
	public static void setActivityIndexFromView(String activityIndex) {
		if(activityIndex.equals(ActivityIndex)) {
			ActivityIndex = activityIndex;
			
			putDataToModel();
		}
		else 
			ActivityIndex = null;
	}
	
	
	public static void dataToView(double result, int ObserverCode) {
		if(ObserverCode == ObserverBMIcode) {
			View1.setTxtResultBMI(result);
		}
		else if (ObserverCode == ObserverTERcode) {
			View1.setTxtResultTER(result);
		}
	}
	
	public static void setDataFromModel(double result, int ObserverCode) {
		if (result != 0) 
			dataToView(result, ObserverCode);
	}
	
	/*public static void exampleDietToView(String exampleDiet) {
		View1.displayErrorMessage(exampleDiet);
	}
	
	public static void setDietsFromModel(String exampleDiet) {
		if(exampleDiet != null) 
			exampleDietToView(exampleDiet);
			
	}*/

}
