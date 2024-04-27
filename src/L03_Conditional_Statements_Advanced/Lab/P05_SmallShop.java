package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P05_SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double coffeePrice = switch (city){
            case "Sofia" -> 0.50;
            case "Plovdiv" -> 0.40;
            case "Varna" -> 0.45;
            default -> 0.0;
        };

        double waterPrice = switch (city){
            case "Sofia" -> 0.80;
            case "Plovdiv", "Varna" -> 0.70;
            default -> 0.0;
        };

        double beerPrice = switch (city){
            case "Sofia" -> 1.20;
            case "Plovdiv" -> 1.15;
            case "Varna" -> 1.10;
            default -> 0.0;
        };

        double sweetsPrice = switch (city){
            case "Sofia" -> 1.45;
            case "Plovdiv" -> 1.30;
            case "Varna" -> 1.35;
            default -> 0.0;
        };

        double peanutsPrice = switch (city){
            case "Sofia" -> 1.60;
            case "Plovdiv" -> 1.50;
            case "Varna" -> 1.55;
            default -> 0.0;
        };

        double totalCoffeePrice = coffeePrice * quantity;
        double totalWaterPrice = waterPrice * quantity;
        double totalBeerPrice = beerPrice * quantity;
        double totalSweetsPrice = sweetsPrice * quantity;
        double totalPeanutsPrice = peanutsPrice * quantity;

        double totalPrice = switch (product){
            case "coffee" -> totalCoffeePrice;
            case "water" -> totalWaterPrice;
            case "beer" -> totalBeerPrice;
            case "sweets" -> totalSweetsPrice;
            case "peanuts" -> totalPeanutsPrice;
            default -> 0.0;
        };

        System.out.printf("%.1f", totalPrice);
    }
}
