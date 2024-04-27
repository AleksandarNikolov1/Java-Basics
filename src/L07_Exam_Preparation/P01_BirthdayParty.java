package L07_Exam_Preparation;

import java.util.Scanner;

public class P01_BirthdayParty {
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
