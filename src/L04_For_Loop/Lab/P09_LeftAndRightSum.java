package L04_For_Loop.Lab;

import java.util.Scanner;

public class P09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        String output = "";

        for (int i = 0; i < n * 2; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (i < n)
                leftSum += num;

            else
                rightSum += num;
        }

        if (leftSum == rightSum)
            output = String.format("Yes, sum = %d", leftSum);

        else
            output = String.format("No, diff = %d", Math.abs(leftSum - rightSum));

        System.out.println(output);

    }
}
