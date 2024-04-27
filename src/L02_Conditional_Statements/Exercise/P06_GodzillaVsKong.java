package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P06_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double clothingPrice = Double.parseDouble(sc.nextLine());

        double decorPrice = budget * 0.1;
        if (statists > 150){
            clothingPrice *= 0.9;
        }

        double neededPrice = statists * clothingPrice + decorPrice;

        double diff = Math.abs(budget - neededPrice);

        if (neededPrice > budget)
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff);

        else
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff);

    }
}
