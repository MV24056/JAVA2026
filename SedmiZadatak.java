package DrugaNedeljaVjezbe;

public class SedmiZadatak {
public static void main(String[] args) {
		
		int x1 = 1;
		int x2 = 2;
		
		int y1 = 5;
		int y2 = 3;
		
		double x3 = (x1+x2)/2.0;
		double y3 = (y1+y2)/2.0;
		
		double udaljenostD = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		double udaljenostP = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));

		
		
		System.out.println("Odaljenosti iymedju studenata i sredine su:" + udaljenostD + "i :" + udaljenostP );

	}
	}

