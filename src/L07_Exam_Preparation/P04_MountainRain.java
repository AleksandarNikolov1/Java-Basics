package L07_Exam_Preparation;

import java.util.Scanner;

public class P04_MountainRain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double secondsPerMeter = Double.parseDouble(sc.nextLine());

        int delaysInSeconds = (int) (distance / 50) * 30;

        double neededTimeToClimbInSeconds = (distance * secondsPerMeter) + delaysInSeconds;

        double diff = Math.abs(recordInSeconds - neededTimeToClimbInSeconds);

        if (neededTimeToClimbInSeconds < recordInSeconds)
            System.out.printf("Yes! The new record is %.2f seconds.", neededTimeToClimbInSeconds);

        else
            System.out.printf("No! He was %.2f seconds slower.", diff);
    }
}
