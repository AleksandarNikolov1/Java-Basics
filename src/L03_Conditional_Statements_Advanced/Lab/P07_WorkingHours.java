package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P07_WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.nextLine());
        String dayOfWeek = sc.nextLine();

        String output = "";

        if (!dayOfWeek.equals("Sunday")) {
            if (h >= 10 && h <= 18)
                output = "open";
            else
                output = "closed";
        }
        else
            output = "closed";

        System.out.println(output);
    }
}
