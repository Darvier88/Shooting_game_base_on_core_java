public class Main {
	public static void main(String[] args) {
		PlayerFactory player1Factory = new Player1Factory();
        PlayerFactory player2Factory = new Player2Factory();

        Player player1 = player1Factory.createPlayer("Jhon", "AK-47", 100, null);
        Player player2 = player2Factory.createPlayer("Tom", "Machine gun", 100, true);

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