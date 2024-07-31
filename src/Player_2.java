public class Player_2 extends Player_1{
    private boolean armour;


    public Player_2(String name, String weapon, int health, Boolean armour) {
        super(name, weapon, health);
        this.armour = armour;
    }
    public boolean getArmour() {
        return armour;
    }
    
}
