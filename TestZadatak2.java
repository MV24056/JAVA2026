package TrecaNedeljaVjezbe;

public class TestZadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        ZaposleniZadatak2 z1 = new ZaposleniZadatak2("Sandra", "Markovic", 23, 750.5);
        ZaposleniZadatak2 z2 = new ZaposleniZadatak2("Masa", "Vukovic", 25, 1010);
        ZaposleniZadatak2 z3 = new ZaposleniZadatak2("Medina", "Lukovic", 10, 650);
  
        z1.ispisi();
        z1.povecajPlatu();
        
        z2.ispisi();
        z2.povecajPlatu();
        
        z3.ispisi();
        z3.povecajPlatu();
      
        

	}

}
