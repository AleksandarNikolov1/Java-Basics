package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double deposit = Double.parseDouble(sc.nextLine());
        int termInMonths = Integer.parseInt(sc.nextLine());
        double interest = Double.parseDouble(sc.nextLine()) / 100;

        double finalAmount = deposit + termInMonths * ((deposit * interest) / 12);

        System.out.printf("%.2f", finalAmount);

    }
}
