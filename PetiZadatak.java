package DrugaNedeljaVjezbe;

public class PetiZadatak {

	public static void main(String[] args) {
	
		int broj = 1354;
		int cifra1 = broj/1000;
		int cifra2 = (broj/100)%10;
		int cifra3 = (broj/10)%10;
		int cifra4 = broj%10;
		
		int suma = cifra1 + cifra2 + cifra3 + cifra4;
		int kvadrat = suma*suma ;
		
		System.out.println("kvadrat zbira cifara broja je: " + kvadrat);
	
		
		
		
	}

}
