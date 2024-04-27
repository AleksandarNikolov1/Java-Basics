package L07_Exam_Preparation;

import java.util.Scanner;

public class P09_CareOfPuppy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int foodQuantity = Integer.parseInt(sc.nextLine()) * 1000;

        String input = sc.nextLine();

        int eatenFood = 0;

        while (!input.equals("Adopted")){
            int grPerDay = Integer.parseInt(input);
            eatenFood += grPerDay;
            input = sc.nextLine();
        }

        int diff = Math.abs(foodQuantity - eatenFood);

        if (foodQuantity >= eatenFood)
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);

        else
            System.out.printf("Food is not enough. You need %d grams more.", diff);
    }
}
