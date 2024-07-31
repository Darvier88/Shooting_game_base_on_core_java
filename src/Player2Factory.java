
public class Player2Factory extends PlayerFactory {
	@Override
    public Player createPlayer(String name, String weapon, int health, Boolean armour) {
        return new Player_2(name, weapon, health, armour);
    }
}
