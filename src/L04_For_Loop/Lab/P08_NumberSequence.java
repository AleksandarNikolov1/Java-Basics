package L04_For_Loop.Lab;

import java.util.Scanner;

public class P08_NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        System.out.printf("Max number: %d%nMin number: %d", max, min);

    }
}
