public class Player_1 {
    private String name;
    private String weapon;
    private int health;
    private AttackStrategy attackStrategy;

    public Player_1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health<=0||health>100){
            this.health=100;
        }
        else {
            this.health = health;
        }

    }
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack(this);
    }

    // Implementación de métodos de la interfaz Player
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getWeapon() { return weapon; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

}
