public class Player {
    private String name;
    private int energy;
    private int score;

    public Player(String name) {
        this.name = name;
        this.energy = 100;
        this.score = 0;
    }

    public String getName() { return name; }
    public int getEnergy() { return energy; }
    public int getScore() { return score; }

    public void addEnergy(int amount) {
        energy += amount;
        if (energy > 150) energy = 150;
    }

    public void reduceEnergy(int amount) {
        energy -= amount;
        if (energy < 0) energy = 0;
    }

    public void addScore(int amount) { score += amount; }

    public boolean isAlive() { return energy > 0; }
}
