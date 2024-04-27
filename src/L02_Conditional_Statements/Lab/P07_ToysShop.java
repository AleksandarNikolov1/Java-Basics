package L02_Conditional_Statements.Lab;

import java.util.Scanner;

public class P07_ToysShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tripPrice = Double.parseDouble(sc.nextLine());
        int puzzlesCount = Integer.parseInt(sc.nextLine());
        int talkingDollsCount = Integer.parseInt(sc.nextLine());
        int teddyBearsCount = Integer.parseInt(sc.nextLine());
        int minionsCount = Integer.parseInt(sc.nextLine());
        int trucksCount = Integer.parseInt(sc.nextLine());

        double puzzlePrice = 2.60;
        double talkingDollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2;

        double rent = 0.1;

        double totalPrice = puzzlesCount * puzzlePrice
                + talkingDollsCount * talkingDollPrice
                + teddyBearsCount * teddyBearPrice
                + minionsCount * minionPrice
                + trucksCount * truckPrice;

        int toysCount = puzzlesCount + talkingDollsCount
                + teddyBearsCount + minionsCount + trucksCount;

        if (toysCount >= 50)
            totalPrice *= 0.75;

        double profit = totalPrice - totalPrice * rent;

        if (profit >= tripPrice)
            System.out.printf("Yes! %.2f lv left.", profit - tripPrice);

        else
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - profit);

    }
}
