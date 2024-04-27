package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P06_NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if (num >= -100 && num <= 100 && num != 0)
            System.out.println("Yes");

        else
            System.out.println("No");
    }
}
