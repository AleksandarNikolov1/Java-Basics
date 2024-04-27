package L04_For_Loop.Lab;

import java.util.Scanner;

public class P03_NumbersFrom1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }
    }
}
