package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P09_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String output = switch (input){
            case "banana", "apple", "kiwi", "lemon", "cherry", "grapes" -> "fruit";
            case "tomato", "cucumber", "pepper", "carrot" -> "vegetable";
            default -> "unknown";
        };

        System.out.println(output);
    }
}
