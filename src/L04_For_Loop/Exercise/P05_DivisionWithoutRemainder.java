package L04_For_Loop.Exercise;

import java.util.Scanner;

public class P05_DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1Count = 0;
        double p2Count = 0;
        double p3Count = 0;

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num % 2 == 0)
                p1Count ++;

            if (num % 3 == 0)
                p2Count ++;

            if (num % 4 == 0)
                p3Count++;
        }

        double p1 = p1Count / n * 100;
        double p2 = p2Count / n * 100;
        double p3 = p3Count / n * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n", p1, p2, p3);
    }
}
