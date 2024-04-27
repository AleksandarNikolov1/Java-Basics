package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rosesPrice = 5;
        double dahliasPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3;
        double gladiolusPrice = 2.50;

        String flowerType = sc.nextLine();
        int flowersCount = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double totalPrice = 0;

        switch (flowerType) {
            case "Roses" -> {
                totalPrice = flowersCount * rosesPrice;
                if (flowersCount > 80)
                    totalPrice *= 0.9;
            }
            case "Dahlias" -> {
                totalPrice = flowersCount * dahliasPrice;
                if (flowersCount > 90)
                    totalPrice *= 0.85;
            }
            case "Tulips" -> {
                totalPrice = flowersCount * tulipsPrice;
                if (flowersCount > 80)
                    totalPrice *= 0.85;
            }
            case "Narcissus" -> {
                totalPrice = flowersCount * narcissusPrice;
                if (flowersCount < 120)
                    totalPrice *= 1.15;
            }
            case "Gladiolus" -> {
                totalPrice = flowersCount * gladiolusPrice;
                if (flowersCount < 80)
                    totalPrice *= 1.2;
            }
        }

        double diff = Math.abs(budget - totalPrice);

        if (budget > totalPrice)
            System.out.printf("Hey, you have a great garden with " +
                    "%d %s and %.2f leva left.", flowersCount, flowerType, diff);

        else
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
    }
}
