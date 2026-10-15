package PetaNedeljaVjezbe;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner (System.in);
        System.out.print("Unesi prvi string: ");
        String prvi = sc.nextLine();

        System.out.print("Unesi drugi string: ");
        String drugi = sc.nextLine();

        if (prvi.contains(drugi.trim())) {
            System.out.println("Drugi string je podstring prvog.");
        } else {
            System.out.println("Drugi string nije podstring prvog.");
        }
        
        sc.close();
	}

}
