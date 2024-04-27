package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P04_FishingBoat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fishermenCount = Integer.parseInt(sc.nextLine());

        double rent = switch (season) {
            case "Spring" -> 3000;
            case "Summer" -> 4200;
            case "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };

        if (fishermenCount <= 6)
            rent *= 0.9;
        else if (fishermenCount <= 11)
            rent *= 0.85;
        else if (fishermenCount > 12)
            rent *= 0.75;

        if (fishermenCount % 2 == 0 && !season.equals("Autumn"))
            rent *= 0.95;

        double diff = Math.abs(budget - rent);

        if (budget > rent)
            System.out.printf("Yes! You have %.2f leva left.", diff);

        else
            System.out.printf("Not enough money! You need %.2f leva.", diff);


    }
}
