package L04_For_Loop.Exercise;

import java.util.Scanner;

public class P04_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());

            if (num < 200)
                p1Count++;

            else if (num >= 200 && num < 400)
                p2Count++;

            else if (num >= 400 && num < 600)
                p3Count++;

            else if (num >= 600 && num < 800)
                p4Count ++;

            else if (num >= 800)
                p5Count++;
        }

        double p1 = Double.valueOf(p1Count) / n * 100;
        double p2 = Double.valueOf(p2Count) / n * 100;
        double p3 = Double.valueOf(p3Count) / n * 100;
        double p4 = Double.valueOf(p4Count) / n * 100;
        double p5 = Double.valueOf(p5Count) / n * 100;

        System.out.printf("%.2f%%%n" +
                          "%.2f%%%n" +
                          "%.2f%%%n" +
                          "%.2f%%%n" +
                          "%.2f%%%n", p1, p2, p3, p4, p5);

    }
}
