import java.util.Scanner;

public class ExitRoom extends Room {

    public ExitRoom() {
        super("Exit Room");
    }

    @Override
    public void enterRoom(Player player, Scanner sc) {
        System.out.println("\n🏁 You found the Exit Room!");
        System.out.println("🎉 Congratulations, " + player.getName() + "! You escaped the Mind Maze!");

        System.out.println("You exit the maze with:");
        System.out.println("Energy: " + player.getEnergy());
        System.out.println("Score: " + player.getScore());
    }
}
