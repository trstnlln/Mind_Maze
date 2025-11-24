import java.util.Random;
import java.util.Scanner;

public class TreasureRoom extends Room {

    public TreasureRoom() {
        super("Treasure Room");
    }

    @Override
    public void enterRoom(Player player, Scanner sc) {
        Random rand = new Random();
        int reward = 15 + rand.nextInt(20);

        System.out.println("\n💰 You entered a Treasure Room!");
        System.out.println("You found treasure! +" + reward + " energy and +10 score!");
        player.addEnergy(reward);
        player.addScore(10);
    }
}

