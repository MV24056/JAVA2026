package CetvrtaNedeljaVjezbe;

import java.util.ArrayList;

public class Game {

	private Player player;
	private ArrayList<Enemy> enemies;
	private static ArrayList<String> eventLog = new ArrayList<>();
	
//ovdje smo isto kreirali konstruktore

	public Game(Player player, ArrayList<Enemy> enemies) {
		super();
		this.player = player;
		this.enemies = enemies;
	}
	

// ovdje smo provjeravali da li se neprijatelji preklapaju odnsno da li imaju sudar
	public static boolean checkCollision(Player p, Enemy e) {
		return p.getX() < e.getX() + e.getWidth()  //ovdje provjeravamo da li je lijeva ivica od desne ivice
		&& p.getX() + p.getWidth() > e.getX()
				&& p.getY() < e.getY() + e.getHeight() && p.getY() + p.getHeight() > e.getY();
	}


	// smanjuje vrijednost neprijatelja
	public static void decreaseHealth(Player p, Enemy e) {
		if (checkCollision(p, e)) {
			p.setHealth(p.getHealth() - e.getDamage());
			eventLog.add("HIT: Player by " + e.getType() + " for " + e.getDamage() + " -> HP " + p.getHealth());
			}
	}

	// ovdje smo pravili metodu add enemi koja je unosila enemi u array listu
	public void addEnemy(Enemy e) {
		enemies.add(e);
		eventLog.add("Enemy je dodat" + e.getType());
	}
	

	//prolazimo kroz enemije i provjeravamo da li su istog tipa

public Enemy findByType(String query) {
    for (Enemy e : enemies) {
        if (e.getType().equalsIgnoreCase(query)) { 
            return e;
        }
    }
    return null;
}


//ovdje vracamo sve neprijatelje koje se trenutno sudaraju sa tim igracem
	
	public ArrayList<Enemy> collidingWithPlayer() {

    ArrayList<Enemy> rezultat = new ArrayList<>();

    for (Enemy e : enemies) {

        if (checkCollision(player, e)) {

            rezultat.add(e);

        }

    }

    return rezultat;

}

//i za svakog igraca on ce nama ako se sudara da prodje kroz enemije i da nam ispise metodu decreaseHealth
public void resolveCollisions() {

    for (Enemy e : enemies) {

        if (checkCollision(player, e)) {

            decreaseHealth(player, e);

        }
    }
}
   





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p = new Player("Player1", 12, 15, 20, 25, 40);
		Enemy e1 = new Enemy("Goblin", 14, 20, 17, 16, 35);
		Enemy e2 = new Enemy("Goblin2", 25, 45, 45, 28, 70);

		decreaseHealth(p, e1);
		decreaseHealth(p, e2);

	}

}
