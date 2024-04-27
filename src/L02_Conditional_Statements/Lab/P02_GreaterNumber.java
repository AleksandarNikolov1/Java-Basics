package L02_Conditional_Statements.Lab;

import java.util.Scanner;

public class P02_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        if (firstNum > secondNum)
            System.out.println(firstNum);
        else
            System.out.println(secondNum);
    }
}
