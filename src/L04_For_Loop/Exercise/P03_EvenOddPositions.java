package L04_For_Loop.Exercise;

import java.util.Scanner;

public class P03_EvenOddPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;

        String output = "";

        for (int i = 1; i <= n; i++) {

            double num = Double.parseDouble(sc.nextLine());

            if (i % 2 == 1){
                oddSum += num;

                if (num > oddMax)
                    oddMax = num;

                if (num < oddMin)
                    oddMin = num;
            }

            else {
                evenSum += num;

                if (num > evenMax)
                    evenMax = num;

                if (num < evenMin)
                    evenMin = num;
            }
        }

        if (n == 0) {
            output = String.format("OddSum=%.2f,%nOddMin=No,%nOddMax=No,%nEvenSum=%.2f,%nEvenMin=No,%nEvenMax=No",
                    oddSum, evenSum);
        }
        else if (n == 1){
            output = String.format("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=No,%nEvenMax=No",
                    oddSum, oddMin, oddMax, evenSum);
        }
        else {
            output = String.format("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f",
                    oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
        }

        System.out.println(output);

    }
}

