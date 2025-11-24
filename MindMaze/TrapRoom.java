import java.util.Random;
import java.util.Scanner;

public class TrapRoom extends Room {

    public TrapRoom() {
        super("Trap Room");
    }

    @Override
    public void enterRoom(Player player, Scanner sc) {
        Random rand = new Random();
        int damage = 10 + rand.nextInt(15);

        System.out.println("\n💀 You entered a Trap Room!");
        System.out.println("Oh no! You triggered spikes! -" + damage + " energy!");
        player.reduceEnergy(damage);
    }
}
