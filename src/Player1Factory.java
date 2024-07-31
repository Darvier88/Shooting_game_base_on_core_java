
public class Player1Factory extends PlayerFactory {
	 @Override
	    public Player createPlayer(String name, String weapon, int health, Boolean armour) {
	        return new Player_1(name, weapon, health);
	    }
}
