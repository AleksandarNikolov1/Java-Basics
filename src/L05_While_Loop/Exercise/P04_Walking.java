package L05_While_Loop.Exercise;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stepsGoal = 10000;
        int totalSteps = 0;

        String input = sc.nextLine();

        while (!input.equals("Going home")){

            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= stepsGoal)
                break;

            input = sc.nextLine();

            if (input.equals("Going home")) {
                steps = Integer.parseInt(sc.nextLine());
                totalSteps += steps;
                break;
            }
        }

        int diff = Math.abs(stepsGoal - totalSteps);

        if (totalSteps >= stepsGoal)
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);

        else
            System.out.printf("%d more steps to reach goal.", diff);
    }
}
