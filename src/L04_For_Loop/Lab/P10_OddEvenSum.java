package L04_For_Loop.Lab;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int firstSum = 0;
        int secondSum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (i % 2 == 0)
                firstSum += num;

            else
                secondSum += num;
        }

        if (firstSum == secondSum)
            System.out.printf("Yes%nSum = %d", firstSum);

        else
            System.out.printf("No%nDiff = %d", Math.abs(firstSum - secondSum));
    }
}
