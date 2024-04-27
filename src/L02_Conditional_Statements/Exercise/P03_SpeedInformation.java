package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P03_SpeedInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double speed = Double.parseDouble(sc.nextLine());
        String output = "";

        if (speed > 0 && speed <= 10)
            output = "slow";

        else if (speed > 10 && speed <= 50)
            output = "average";

        else if (speed > 50 && speed <= 150)
            output = "fast";

        else if (speed > 150 && speed <= 1000)
            output = "ultra fast";

        else if (speed > 1000)
            output = "extremely fast";

        System.out.println(output);
    }
}
