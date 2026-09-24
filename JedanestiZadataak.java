package DrugaNedeljaVjezbe;

public class JedanestiZadataak {

	public static void main(String[] args) {
		int broj = 65;

        int prvacifra = broj / 10;
        int drugacifra = broj % 10;

        if (prvacifra > drugacifra) {
        	int raz = prvacifra - drugacifra;
        	  System.out.println("Razlika je :" + raz);           
        } else if (prvacifra < drugacifra) {
            int zbir = prvacifra + drugacifra;
            System.out.println("Zbir je je :" + zbir); 
        } else {
        	int proizvod = prvacifra * drugacifra;
            System.out.println("proizvod je : " + proizvod);
        }
	}

}
