package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String destination = "";
        double neededMoney = 0;
        String place = "";

        switch (season) {
            case "summer" -> place = "Camp";
            case "winter" -> place = "Hotel";
        }

        if (budget <= 100){
            destination = "Bulgaria";
            if (season.equals("summer"))
                neededMoney = budget * 0.3;
            else if (season.equals("winter"))
                neededMoney = budget *  0.7;
        }
        else if (budget > 100 && budget <= 1000){
            destination = "Balkans";
            if (season.equals("summer"))
                neededMoney = budget * 0.4;
            else if (season.equals("winter"))
                neededMoney = budget * 0.8;
        }
        else if (budget > 1000){
            destination = "Europe";
            neededMoney = budget * 0.9;
            place = "Hotel";
        }



        System.out.printf("Somewhere in %s%n%s – %.2f", destination, place, neededMoney);
    }
}
