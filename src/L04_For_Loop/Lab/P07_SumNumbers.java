package L04_For_Loop.Lab;

import java.util.Scanner;

public class P07_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());

            sum += num;
        }

        System.out.println(sum);
    }
}
