
public class Gun1Attack implements AttackStrategy {
	@Override
    public void attack(Player_1 player) {
		if (player instanceof Player_2) {
            Player_2 player2 = (Player_2) player;
            if (player2.getArmour()) {
                player2.setHealth(player2.getHealth() - 10);
                System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 10. New health is: " + player2.getHealth());
            } else {
                player2.setHealth(player2.getHealth() - 40);
                System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 40. New health is: " + player2.getHealth());
            }
        } else {
            player.setHealth(player.getHealth() - 20);
            System.out.println("Hit by gun 1. Health reduced by 20. New health is: " + player.getHealth());
        }
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " is dead");
        }
    }
}
