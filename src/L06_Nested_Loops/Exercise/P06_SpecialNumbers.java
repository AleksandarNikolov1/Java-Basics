package L06_Nested_Loops.Exercise;

import java.util.Scanner;

public class P06_SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {

            String num = String.valueOf(i);

            boolean isSpecialNumber = true;

            for (int j = 0; j < num.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(num.charAt(j)));

                if (num.contains("0"))
                    isSpecialNumber = false;

                else if (n % currentDigit != 0)
                    isSpecialNumber = false;
            }

            if (isSpecialNumber)
                System.out.print(num + " ");
        }
    }
}
