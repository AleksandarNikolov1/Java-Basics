package L06_Nested_Loops.Lab;

import java.util.Scanner;

public class P05_Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = 0;

        String destination = sc.nextLine();

        while (!destination.equals("End")){

            int neededBudget = Integer.parseInt(sc.nextLine());

            while (neededBudget > budget) {
                int savedMoney = Integer.parseInt(sc.nextLine());
                budget += savedMoney;
            }

            System.out.println("Going to " + destination + "!");
            budget = 0;

            destination = sc.nextLine();
        }
    }
}
