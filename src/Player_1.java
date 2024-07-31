public class Player_1 extends Player {
    private String name;
    private String weapon;
    private int health;

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

    // Implementación de métodos de la interfaz Player
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getWeapon() { return weapon; }
    public void setWeapon(String weapon) { this.weapon = weapon; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public void hitByGun1() {
        this.health -= 20;
        if(this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Hit by gun 1 health reduced by 20 and new health is :" + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    public void hitByGun2() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Hit by gun 2 health reduced by 30 and new health is :" + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is dead");
        }
    }

    public void headshot() {
        this.health = 0;
        System.out.println("Head shoot your health is: " + this.health + " "  + getName() + " is dead");
    }

}
