package L07_Exam_Preparation;

import java.util.Scanner;

public class P03_CatWalking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutesForWalk = Integer.parseInt(sc.nextLine());
        int walksCount = Integer.parseInt(sc.nextLine());
        int caloriesConsumedPerDay = Integer.parseInt(sc.nextLine());

        int burnedCaloriesPerMinute = 5;

        int burnedCaloriesPerDay = walksCount * minutesForWalk * burnedCaloriesPerMinute;

        if (burnedCaloriesPerDay >= (caloriesConsumedPerDay / 2))
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCaloriesPerDay);

        else
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCaloriesPerDay);

    }
}
