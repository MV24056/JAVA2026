package CetvrtaNedeljaVjezbe;

public class Enemy {

	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;

	
	
	public Enemy(String type, int x, int y, int width, int height, int damage) {
		super();
		this.type = type;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getDamage() {
		return damage;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setDamage(int damage) {
		if (damage >= 0 && damage <= 100) {
			this.damage = damage;

		} else {
			System.out.println("Greska tokom unosa ne smije biti manji od 0 i veci od 100 ");

		}
	}
	
	@Override
	public String toString() {
	    return "Enemy [" + type + "] @ (" + x + ", " + y + ") [" + width + "x" + height + "] Damage=" + damage;
	}

}
