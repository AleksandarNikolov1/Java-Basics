package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P10_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if (!(num >= 100 && num <= 200 || num == 0))
            System.out.println("invalid");

    }
}
