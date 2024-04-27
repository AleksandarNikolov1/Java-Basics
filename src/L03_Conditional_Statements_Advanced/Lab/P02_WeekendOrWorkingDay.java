package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P02_WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayOfWeek = sc.nextLine();
        String output = switch (dayOfWeek) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Working day";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Error";
        };

        System.out.println(output);
    }
}
