package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P02_SummerOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees = Integer.parseInt(sc.nextLine());
        String timeOfDay = sc.nextLine();

        String outfit = "";
        String shoes = "";

        switch (timeOfDay){
            case "Morning":
                if (degrees >= 10 && degrees <= 18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                else if(degrees > 18 && degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                else {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                else if(degrees > 18 && degrees <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                else {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                else if(degrees > 18 && degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                else {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;

        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
