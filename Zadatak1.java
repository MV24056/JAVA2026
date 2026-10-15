package PetaNedeljaVjezbe;

import java.util.Scanner;

public class Zadatak1 {

	//koliko rijeci ima u recenici
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

    
        System.out.print("Unesite recenicu: ");
        String recenica = sc.nextLine().trim();

      
        if (recenica.isEmpty()) {
            System.out.println("recenica sadrzi rijeci");
        } else {
            
            String[] rijeci = recenica.split("\\s+");
             int brojRijeci = rijeci.length;

            System.out.println("Unesena reenica ima " + brojRijeci + " riječ(i).");
        }

        sc.close();
	}

}
