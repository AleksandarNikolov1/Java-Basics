package L01_First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P09_YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pricePerSqMeter = 7.61;
        double discount = 0.18;

        double sqMetersForLandscaping = Double.parseDouble(sc.nextLine());

        double totalPrice = pricePerSqMeter * sqMetersForLandscaping;

        double discountPrice = totalPrice * discount;
        double finalPrice = totalPrice - discountPrice;

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discountPrice);

    }
}
