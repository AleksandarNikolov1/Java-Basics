package L04_For_Loop.Lab;

import java.util.Scanner;

public class P02_NumbersFromNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
