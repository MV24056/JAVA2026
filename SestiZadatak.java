package DrugaNedeljaVjezbe;

public class SestiZadatak {

	public static void main(String[] args) {
		
		int broj =233;
		int cifra1 = broj%10;
		int cifra2 = (broj/10)%10;
		int cifra3 =(broj%100)%10;
		
		int novi = cifra1*100+cifra2*10+cifra3;
		
		
		
		
		System.out.println("Novi broj je" + novi);

	}

}
