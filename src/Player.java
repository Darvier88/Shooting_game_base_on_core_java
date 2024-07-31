
public interface Player {
	String getName();
    void setName(String name);
    String getWeapon();
    void setWeapon(String weapon);
    int getHealth();
    void setHealth(int health);
    void setAttackStrategy(AttackStrategy attackStrategy);
    void performAttack();
}
