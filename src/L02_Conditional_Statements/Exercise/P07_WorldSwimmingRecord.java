package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P07_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      double record = Double.parseDouble(sc.nextLine());
      double meters = Double.parseDouble(sc.nextLine());
      double secondsPerMeter = Double.parseDouble(sc.nextLine());

      int delays = (int) (meters / 15);
      double delayInSeconds = delays * 12.5;

      double neededTimeInSecs = meters * secondsPerMeter + delayInSeconds;

      double diff = neededTimeInSecs - record;

      if (record > neededTimeInSecs)
          System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", neededTimeInSecs);

      else
          System.out.printf("No, he failed! He was %.2f seconds slower.", diff);

    }
}
