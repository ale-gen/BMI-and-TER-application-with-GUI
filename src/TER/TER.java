package TER;

public class TER {
	
	private double TERResult;

	public double getTERResult() {
		return TERResult;
	}

	public void setTERResult(double TERResult) {
		this.TERResult = TERResult;
		System.out.println("Wartość: " + TERResult);
	}
	
	public static String ExampleVegetarianDiet(double resultTER) {
		if (resultTER < 2000) {
			return " Śniadanie: Omlet z warzywami: 345 kcal \n Przekąska: Jabłko`; 70 kcal \n Obiad: Ryba po grecku z ryżem i warzywami: 550 kcal \n "
			+ "Podwieczorek: galaretka z brzoskwinią: 150 kcal \n Kolacja: Kanapka z rukolą i serem pleśniowym: 300 kcal ";
		}
		else if(resultTER > 2500) {
			return " Śniadanie: Półbagietka z tofu, mozarellą i rukolą: 600 kcal \n Przekąska: Domowe frytki: 400 kcal \n Obiad: Makaron w sosie serowym  "
					+ "i z warzywami: 700 kcal \n Podwieczorek: Skyr z owocami(winogronami, jabłkiem, pomarańczą) i 3 kostkami czekolady: 500 kcal \n Kolacja: Omlet z warzywami (duża porcja): 600 kcal";
		}
		else 
			return " Śniadanie: 2 kromki chleba pełnoziarnistego z rukolą i mozarellą: 300 kcal \n Przekąska: Banan: 120 kcal \n Obiad: Tofu wędzone z kaszą jaglaną i warzywami: 500 kcal "
					+ "\n Podwieczorek: Galaretka z brzoskwinią: 150 kcal \n Kolacja: Omlet z warzywami (mała porcja): 250 kcal";
	}
	
	public static String ExampleMeatDiet(double resultTER) {
		if (resultTER < 2000) {
			return " Śniadanie: Omlet z kiełbasą: 345 kcal \n Przekąska: Jabłko`; 70 kcal \n Obiad: Kurczak curry z ryżem i warzywami: 550 kcal \n "
			+ "Podwieczorek: galaretka z brzoskwinią: 150 kcal \n Kolacja: Kanapka z rukolą, indykiem i serem pleśniowym: 300 kcal ";
		}
		else if(resultTER > 2500) {
			return " Śniadanie: Półbagietka z indykiem, rukolą, serem pleśniowym: 600 kcal \n Przekąska: Domowe frytki: 400 kcal \n Obiad: Kurczak curry z makaronem w sosie serowym "
					+ "i z warzywami: 700 kcal \n Podwieczorek: Skyr z owocami(winogronami, jabłkiem, pomarańczą) i 3 kostkami czekolady: 500 kcal \n Kolacja: Omlet z kiełbasą (duża porcja): 600 kcal";
		}
		else 
			return " Śniadanie: 2 kromki chleba pełnoziarnistego z indykiem, rukolą i mozarellą: 300 kcal \n Przekąska: Banan: 120 kcal \n Obiad: Kurczak w ziołach z kaszą jaglaną i warzywami: 500 kcal "
					+ "\n Podwieczorek: Galaretka z brzoskwinią: 150 kcal \n Kolacja: Omlet z kiełbasą (mała porcja): 250 kcal";
	}
	
	public static String showCommunicate(double TERResult) {
		if (TERResult < 1500) 
			return "Wskażnik TER: " + TERResult + "\n" + " Powinieneś więcej ćwiczyć, aby zwiększyć swoje zapotrzebowanie energetyczne! Wybierz trening 1";
		else if (TERResult > 3000)
			return "Wskaźnik TER: " + TERResult  + " \n" + "Uważaj, żeby się nie przetrenować! Wybierz trening dopasowany do Twoich preferencji!";
		else 
			return "Wskażnik TER: " + TERResult  + "\n" + "Oby tak dalej! Wybierz trening dopasowany do Twoich preferencji! ";
	}

}
