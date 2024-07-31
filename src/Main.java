public class Main {
	public static void main(String[] args) {
		Player_1 player1 = new Player_1("Jhon", "AK-47", 100);
        Player_2 player2 = new Player_2("Tom", "Machine gun", 100, true);

        // Usar la estrategia Gun1Attack
        player1.setAttackStrategy(new Gun1Attack());
        player1.performAttack();

        player2.setAttackStrategy(new Gun2Attack());
        player2.performAttack();

        // Cambiar a la estrategia HeadshotAttack
        player1.setAttackStrategy(new HeadShotAttack());
        player1.performAttack();
    }
}