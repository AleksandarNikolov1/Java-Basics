package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        String output = "";
        String evenOrOdd = "";
        double result = switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            default -> 0;
        };

        if (result % 2 == 0)
        evenOrOdd = "even";
        else
        evenOrOdd = "odd";

        output = String.format("%d %c %d = %.0f – %s", firstNum, operator, secondNum, result, evenOrOdd );

        if (operator == '/') {
            if (secondNum == 0)
                output = String.format("Cannot divide %d by zero", firstNum);

            else {
                result = Double.valueOf(firstNum) / Double.valueOf(secondNum);
                output = String.format("%d %c %d = %.2f", firstNum, operator, secondNum, result);
            }
        }
        else if (operator == '%'){
            if (secondNum == 0)
                output = String.format("Cannot divide %d by zero", firstNum);

            else {
                result = firstNum % secondNum;
                output = String.format("%d %c %d = %.0f", firstNum, operator, secondNum, result);
            }
        }
        System.out.println(output);
    }
}


