package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P13_SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        String placeType = sc.nextLine();
        String gradeType = sc.nextLine();

        double roomForOnePersonPrice = 18.00;
        double apartmentPrice = 25.00;
        double presidentApartmentPrice = 35.00;

        double totalPrice = 0;

        int nights = days - 1;

        if (placeType.equals("room for one person")){
                totalPrice = nights * roomForOnePersonPrice;
        }
        else if (placeType.equals("apartment")){
            if (nights < 10)
                totalPrice = (apartmentPrice * nights) * 0.7;
            else if (nights >= 10 && nights <= 15)
                totalPrice = (apartmentPrice * nights) * 0.75;
            else if (nights > 15)
                totalPrice = (apartmentPrice * nights) * 0.5;
        }
        else if (placeType.equals("president apartment")){
            if (nights < 10)
                totalPrice = (presidentApartmentPrice * nights) * 0.9;
            else if (nights >= 10 && nights <= 15)
                totalPrice = (presidentApartmentPrice * nights) * 0.85;
            else if (nights > 15)
                totalPrice = (presidentApartmentPrice * nights) * 0.8;
        }

        if (gradeType.equals("positive"))
            totalPrice *= 1.25;

        else if (gradeType.equals("negative"))
            totalPrice *= 0.9;

        System.out.printf("%.2f", totalPrice);
    }
}
