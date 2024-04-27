package L05_While_Loop.Lab;

import java.util.Scanner;

public class P06_MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        String input = sc.nextLine();

        while (!input.equals("Stop")){
            int num = Integer.parseInt(input);

            if (num > max)
                max = num;

            input = sc.nextLine();
        }

        System.out.println(max);

    }
}
