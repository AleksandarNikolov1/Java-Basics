package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P04_PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        char gender = sc.nextLine().charAt(0);

        String title = "";

        if (gender == 'm'){
            if (age >= 16)
                title = "Mr.";

            else
                title = "Master";
        }

        else if (gender == 'f'){
            if (age >= 16)
                title = "Ms.";

            else
                title = "Miss";
        }

        System.out.println(title);
    }
}
