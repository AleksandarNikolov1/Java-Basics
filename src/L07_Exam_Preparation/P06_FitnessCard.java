package L07_Exam_Preparation;

import java.util.Scanner;

public class P06_FitnessCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        char gender = sc.nextLine().charAt(0);
        int age = Integer.parseInt(sc.nextLine());
        String sport = sc.nextLine();

        double price = 0;

        switch (sport){
            case "Gym":
                if (gender == 'm')
                    price = 42;
                else
                    price = 35;
                break;
            case "Boxing":
                if (gender == 'm')
                    price = 41;
                else
                    price = 37;
                break;
            case "Yoga":
                if (gender == 'm')
                    price = 45;
                else
                    price = 42;
                break;
            case "Zumba":
                if (gender == 'm')
                    price = 34;
                else
                    price = 31;
                break;
            case "Dances":
                if (gender == 'm')
                    price = 51;
                else
                    price = 53;
                break;
            case "Pilates":
                if (gender == 'm')
                    price = 39;
                else
                    price = 37;
                break;
        }

        if (age <= 19)
            price *= 0.8;

        double diff = Math.abs(budget - price);

        if (budget > price)
            System.out.printf("You purchased a 1 month pass for %s.", sport);

        else
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
    }
}
