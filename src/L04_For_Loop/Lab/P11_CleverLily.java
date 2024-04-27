package L04_For_Loop.Lab;

import java.util.Scanner;

public class P11_CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        double washingMachinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());

        int toysCount = 0;

        int budget = 0;

        int takenMoney = 0;

        int givenMoney = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                budget += givenMoney;
                givenMoney += 10;
                takenMoney ++;
            }

            else
                toysCount++;


        }

        int toysPrice = toysCount * toyPrice;

        budget += toysPrice;

        budget -= takenMoney;

        double diff = Math.abs(budget - washingMachinePrice);

        if (budget >= washingMachinePrice)
            System.out.printf("Yes! %.2f", diff);

        else
            System.out.printf("No! %.2f", diff);
    }
}
