import java.util.*;

public class MindMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🧠 WELCOME TO MIND MAZE ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) name = "Player";

       Player player = new Player(name);
        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new TrapRoom());
        rooms.add(new TreasureRoom());

        while (rooms.size() < 10) {
            rooms.add(new QuizRoom());
        }

        Collections.shuffle(rooms);


        System.out.println("\nWelcome, " + player.getName() + "! Your energy starts at 100.");
        System.out.println("Navigate through the maze and survive!\n");

        for (int i = 0; i < rooms.size(); i++) {

            if (!player.isAlive()) {
                System.out.println("\n💀 You have no energy left... Game Over!");
                break;
            }

            System.out.println("\n=== Room " + (i + 1) + " of " + "10" + " ===");
            rooms.get(i).enterRoom(player, sc);

            System.out.println("Energy: " + player.getEnergy() + " | Score: " + player.getScore());

            if (i < rooms.size() - 1 && player.isAlive()) {
                System.out.print("\nPress Enter to continue to the next room...");
                sc.nextLine();
            }
        }

        System.out.println("\n=== GAME OVER ===");
        System.out.println("Final Score: " + player.getScore());
        System.out.println("Thank you for playing Mind Maze!");
        sc.close();
    }
}
