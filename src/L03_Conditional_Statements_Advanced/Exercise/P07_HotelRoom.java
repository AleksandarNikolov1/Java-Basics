package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int nightsCount = Integer.parseInt(sc.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        if (month.equals("May") || month.equals("October")){
            studioPrice = 50;
            apartmentPrice = 65;
        }
        else if (month.equals("June") || month.equals("September")){
            studioPrice = 75.20;
            apartmentPrice = 68.70;
        }
        else if (month.equals("July") || month.equals("August")){
            studioPrice = 76;
            apartmentPrice = 77;
        }

        double totalStudioPrice = nightsCount * studioPrice;
        double totalApartmentPrice = nightsCount * apartmentPrice;


        if (nightsCount > 14 && (month.equals("May") || month.equals("October"))){
            totalStudioPrice *= 0.7;
        }
        else if (nightsCount > 7 && (month.equals("May") || month.equals("October"))){
            totalStudioPrice *= 0.95;
        }
        else if (nightsCount > 14 && (month.equals("June") || month.equals("September"))){
            totalStudioPrice *= 0.8;
        }
        if (nightsCount > 14){
            totalApartmentPrice *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", totalApartmentPrice, totalStudioPrice);
    }
}
