package L02_Conditional_Statements.Lab;

import java.util.Scanner;

public class P03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if (num % 2 == 0)
            System.out.println("even");

        else
            System.out.println("odd");
    }
}
