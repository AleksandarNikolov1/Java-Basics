package L05_While_Loop.Lab;

import java.util.Scanner;

public class P05_AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        double accountBalance = 0;

        while(!input.equals("NoMoreMoney")){
            double amount = Double.parseDouble(input);

            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", amount);

            accountBalance += amount;

            input = sc.nextLine();
        }

        System.out.printf("Total: %.2f", accountBalance);
    }
}
