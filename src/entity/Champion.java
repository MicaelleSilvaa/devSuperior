package entity;

public class Champion {
	private String name;
	private int health;
	private int attack;
	private int armor;
	
	public Champion(String name, int health, int attack, int armor) {
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.armor = armor;
	}
	
    public void takeDamage(Champion opponent) {
        int damage = opponent.attack - this.armor;
        if (damage < 1) {
            damage = 1;
        }
        this.health = Math.max(0, this.health - damage);
    }
    
    public String status() {
        if (this.health == 0) {
            return this.name + ": 0 de vida (morreu)";
        } else {
            return this.name + ": " + this.health + " de vida";
        }
    }

}
