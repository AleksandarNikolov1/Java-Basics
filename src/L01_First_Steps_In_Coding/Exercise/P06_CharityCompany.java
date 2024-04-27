package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P06_CharityCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int cookers = Integer.parseInt(sc.nextLine());
        int cakesCount = Integer.parseInt(sc.nextLine());
        int wafflesCount = Integer.parseInt(sc.nextLine());
        int pancakesCount = Integer.parseInt(sc.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        double totalPrice = (((cakesCount * cakePrice + wafflesCount * wafflePrice + pancakesCount * pancakePrice)
                * cookers) * days) * 0.875;

        System.out.printf("%.2f", totalPrice);

    }
}
