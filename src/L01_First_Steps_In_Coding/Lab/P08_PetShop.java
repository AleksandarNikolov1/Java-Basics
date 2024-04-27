package L01_First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P08_PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceForDogsFood = 2.50;
        double priceForOtherPetsFood = 4.00;

        int dogsCount = Integer.parseInt(sc.nextLine());
        int otherPetsCount = Integer.parseInt(sc.nextLine());

        double totalPriceForFood = dogsCount * priceForDogsFood + otherPetsCount * priceForOtherPetsFood;

        System.out.printf("%.1f lv.", totalPriceForFood);
    }
}
