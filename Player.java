package CetvrtaNedeljaVjezbe;

public class Player {

	
	
	//PROJEKAT RADILE MAŠA VUKOVIĆ 24/056 I MEDINA LUKOVIĆ 24/034
	private String name;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;

	// ovdje smo napravili konstruktor od atributa koje smo dobili

	public Player(String name, int x, int y, int width, int height, int health) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}

	// geteri i seteri i krenuli da ih mijenjamo
	public String getName() {
		return name;
	}
// u setter name smo promijenili podesavanja koja smo imali da mijenjamo 
	public void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			System.out.println("Ime ne smije biti pprazno");
		} else {
			this.name = name.trim().replaceAll("\\s + ", " ");
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		return health;
	}

	// ovdje smo podesili na ne smije biti manji od 0 i veci od 100
	public void setHealth(int health) {
		if (health >= 0 && health <= 100) {
			this.health = health;
		} else {
			System.out.println("Greska tokom unosa ne smije biti manji od 0 i veci od 100 ");
		}
	}
	
	
	//tostring metoda 
	@Override
	public String toString() {
	    return "Player [" + name + "] @ (" + x + ", " + y + ") [" + width + "x" + height + "] HP=" + health;
	}

}
