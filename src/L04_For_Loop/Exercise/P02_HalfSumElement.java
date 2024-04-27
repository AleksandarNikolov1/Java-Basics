package L04_For_Loop.Exercise;

import java.util.Scanner;

public class P02_HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int maxEl = Integer.MIN_VALUE;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num > maxEl)
                maxEl = num;

            sum += num;
        }

        sum -= maxEl;

        if (sum == maxEl)
            System.out.printf("Yes%nSum = %d", sum);

        else
            System.out.printf("No%nDiff = %d", Math.abs(sum - maxEl));
    }
}
