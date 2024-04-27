package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P01_SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seconds1 = Integer.parseInt(sc.nextLine());
        int seconds2 = Integer.parseInt(sc.nextLine());
        int seconds3 = Integer.parseInt(sc.nextLine());

        int seconds = seconds1 + seconds2 + seconds3;

        int minutes = 0;

        if (seconds >= 60) {
            minutes = seconds / 60;
            seconds -= minutes * 60;
        }

        String output = "";

        if (seconds < 10)
            output = String.format("%d:0%d", minutes, seconds);

        else
            output = String.format("%d:%d", minutes, seconds);


        System.out.println(output);

    }
}
