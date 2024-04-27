package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P07_FruitsShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(sc.nextLine());
        double bananasCount = Double.parseDouble(sc.nextLine());
        double orangesCount = Double.parseDouble(sc.nextLine());
        double raspberriesCount = Double.parseDouble(sc.nextLine());
        double strawberriesCount = Double.parseDouble(sc.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.5;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        double totalPrice = strawberriesPrice * strawberriesCount + bananasPrice * bananasCount
                + orangesPrice * orangesCount + raspberriesPrice * raspberriesCount;

        System.out.printf("%.2f", totalPrice);

    }
}
