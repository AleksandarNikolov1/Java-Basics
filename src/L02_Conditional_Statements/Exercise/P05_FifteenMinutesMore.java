package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P05_FifteenMinutesMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());



        if (h < 0 || h > 23 || m < 0 || m > 59) {
            System.out.println("Invalid input, try again!");
            System.exit(0);
        }

        m += 15;

        if (m > 60){
            h += 1;
            m -= 60;

            if (h > 23){
                h = 0;
            }
        }

        if (m < 10)
            System.out.printf("%d:0%d", h, m);

        else
            System.out.printf("%d:%d", h, m);


    }
}