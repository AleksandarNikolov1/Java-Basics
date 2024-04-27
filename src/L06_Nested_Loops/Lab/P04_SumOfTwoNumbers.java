package L06_Nested_Loops.Lab;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        int magicNum = Integer.parseInt(sc.nextLine());

        int counter = 0;

        boolean isEqual = false;

        int firstNum = 0;
        int secondNum = 0;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                counter ++;
                if (i + j == magicNum) {
                    firstNum = i;
                    secondNum = j;
                    isEqual = true;
                    break;
                }
            }
            if (isEqual)
                break;
        }

        if (isEqual)
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, firstNum, secondNum, magicNum);

        else
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
    }
}
