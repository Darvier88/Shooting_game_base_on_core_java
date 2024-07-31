public class Main {
    public static void main(String[] args) {
        PlayerFactory player1Factory = new Player1Factory();
        PlayerFactory player2Factory = new Player2Factory();

        Player player1 = player1Factory.createPlayer("Jhon", "AK-47", 100, null);
        Player player2 = player2Factory.createPlayer("Tom", "Machine gun", 100, true);

        player2.hitByGun2();
        player2.hitByGun2();
        player2.hitByGun2();
        player2.hitByGun2();
        player2.hitByGun2();
        player2.hitByGun2();
    }
}
