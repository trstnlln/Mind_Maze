import java.util.Scanner;

public abstract class Room {
    protected String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public abstract void enterRoom(Player player, Scanner sc);
}
