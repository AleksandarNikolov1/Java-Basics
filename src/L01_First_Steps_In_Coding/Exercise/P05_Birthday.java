package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P05_Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rent = Double.parseDouble(sc.nextLine());

        double cakePrice = rent * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animatorPrice = rent / 3;

        double neededAmount = rent + cakePrice + drinksPrice + animatorPrice;

        System.out.printf("%.1f", neededAmount);
    }
}
