package L07_Exam_Preparation;

import java.util.Scanner;

public class P05_EnergyBooster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String size = sc.nextLine();
        int setsCount = Integer.parseInt(sc.nextLine());

        double price = 0;

        switch (fruit){
            case "Watermelon":
                if (size.equals("small"))
                    price = 56.0 * 2;
                else
                    price = 28.70 * 5;
                break;
            case "Mango":
                if (size.equals("small"))
                    price = 36.66 * 2;
                else
                    price = 19.60 * 5;
                break;
            case "Pineapple":
                if (size.equals("small"))
                    price = 42.10 * 2;
                else
                    price = 24.80 * 5;
                break;
            case "Raspberry":
                if (size.equals("small"))
                    price = 20.0 * 2;
                else
                    price = 15.20 * 5;
                break;
        }

        double finalPrice = price * setsCount;

        if (finalPrice >= 400 && finalPrice <= 1000)
            finalPrice *= 0.85;

        else if (finalPrice > 1000)
            finalPrice *= 0.5;

        System.out.printf("%.2f lv.", finalPrice);
    }
}
