import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuizRoom extends Room {

    // Shared questions for ALL QuizRooms (static)
    private static ArrayList<String[]> questionBank = new ArrayList<>(
        Arrays.asList(
            new String[]{"What does OOP stand for?", "object oriented programming"},
            new String[]{"What OOP principle hides internal details of a class?", "encapsulation"},
            new String[]{"What OOP principle allows a class to inherit from another class?", "inheritance"},
            new String[]{"What OOP principle allows objects to take many forms?", "polymorphism"},
            new String[]{"What keyword is used to inherit a class in Java?", "extends"},
            new String[]{"What keyword is used to create an object in Java?", "new"},
            new String[]{"What is the blueprint or template for creating objects?", "class"},
            new String[]{"What is a function inside a class called?", "method"},
            new String[]{"What keyword refers to the current object?", "this"},
            new String[]{"What OOP principle focuses on hiding complexity and showing only essential features?", "abstraction"}
        )
    );

    public QuizRoom() {
        super("Quiz Room");
    }

    @Override
    public void enterRoom(Player player, Scanner sc) {

        System.out.println("\n🧩 You entered a Quiz Room!");

        // Check if there are still available questions
        if (questionBank.isEmpty()) {
            System.out.println("No more questions available! You automatically gain 5 energy.");
            player.addEnergy(5);
            return;
        }

        // Pick a random question from the bank
        Random rand = new Random();
        int index = rand.nextInt(questionBank.size());

        String question = questionBank.get(index)[0];
        String correctAnswer = questionBank.get(index)[1];

        // Display question
        System.out.println("Question: " + question);
        System.out.print("> ");
        String answer = sc.nextLine().trim().toLowerCase();

        if (answer.equals(correctAnswer)) {
            System.out.println("✅ Correct! You gained 10 energy!");
            player.addEnergy(10);
            player.addScore(10);
        } else {
            System.out.println("❌ Wrong! The correct answer was '" + correctAnswer + "'. You lost 10 energy!");
            player.reduceEnergy(10);
        }

        // Remove question so it never appears again
        questionBank.remove(index);
    }
}

