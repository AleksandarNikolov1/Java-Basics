package L01_First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches = Double.parseDouble(sc.nextLine());

        double cms = inches  * 2.54;

        System.out.println(cms);
    }
}
