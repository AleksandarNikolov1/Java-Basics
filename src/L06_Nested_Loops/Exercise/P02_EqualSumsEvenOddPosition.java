package L06_Nested_Loops.Exercise;

import java.util.Scanner;

public class P02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {
            String currentNumToString = String.valueOf(i);

            for (int j = 0; j < currentNumToString.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNumToString.charAt(j)));

                if (j % 2 == 0)
                    oddSum += currentDigit;
                else
                    evenSum += currentDigit;
            }

            if (evenSum == oddSum)
                System.out.print(currentNumToString + " ");

            evenSum = oddSum = 0;
        }
    }
}
