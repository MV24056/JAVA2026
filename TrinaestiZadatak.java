package DrugaNedeljaVjezbe;

import java.util.Scanner;

public class TrinaestiZadatak {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj:");
		        int prvi = sc.nextInt();
		System.out.println("Unesite drugi broj:");
		        int drugi = sc.nextInt();
		System.out.println("Unesite treci broj:");
		        int treci = sc.nextInt();


		        
		        int min = prvi;
		        int max = prvi;

		        if (drugi < min) {
		            min = drugi;
		        }
		        if (treci < min) {
		            min = treci;
		        }

		        if (drugi > max) {
		            max = drugi;
		        }
		        if (treci > max) {
		            max = treci;
		        }

		        System.out.println("Minimum: " + min);
		        System.out.println("Maksimum: " + max);
		  
	}

}
