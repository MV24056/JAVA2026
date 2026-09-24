package DrugaNedeljaVjezbe;

public class DvanaestiZadatak {

	public static void main(String[] args) {
		
		        double r1 = 5;
		        double r2 = 7;

		        double povrsina1 = r1 * r1*Math.PI;
		        double povrsina2 = r2 * r2*Math.PI;

		        if (povrsina1 > povrsina2) {
		            double obim = 2 * Math.PI * r1;
		            System.out.println("obim stola sa vecom"+obim);
		        } else {
		            double obim =2 * Math.PI * r2;
		            System.out.println("obim stoka sa vecom" + obim);
		        }
		    }
		}
	
