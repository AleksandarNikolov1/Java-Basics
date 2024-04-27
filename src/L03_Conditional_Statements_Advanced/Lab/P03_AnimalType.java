package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P03_AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animal = sc.nextLine();
        String animalType = switch (animal){
            case "dog" -> "mammal";
            case "crocodile", "tortoise", "snake" -> "reptile";
            default -> "unknown";
        };

        System.out.println(animalType);
    }
}
