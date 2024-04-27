package L02_Conditional_Statements.Lab;

import java.util.Scanner;

public class P04_PasswordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "s3cr3t!P@ssw0rd";

        String input = sc.nextLine();
        String output = "";

        if (input.equals(password))
            output = "Welcome";

        else
            output = "Wrong password!";

        System.out.println(output);
    }
}
