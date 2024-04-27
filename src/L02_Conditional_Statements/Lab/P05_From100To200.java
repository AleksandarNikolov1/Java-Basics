package L02_Conditional_Statements.Lab;

import java.util.Scanner;

public class P05_From100To200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String output = "";

        if (num < 100)
            output = "Less than 100";

        else if (num >= 100 && num <= 200)
            output = "Between 100 and 200";

        else if (num > 200)
            output = "Greater than 200";

        System.out.println(output);

    }
}
