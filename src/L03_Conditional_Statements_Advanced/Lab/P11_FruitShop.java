package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P11_FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String dayOfWeek = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        boolean invalidInput = false;

        double bananaPrice = 0;
        double applePrice = 0;
        double orangePrice = 0;
        double grapefruitPrice = 0;
        double kiwiPrice = 0;
        double pineapplePrice = 0;
        double grapesPrice = 0;

        if (!dayOfWeek.equals("Monday")
                && !dayOfWeek.equals("Tuesday")
                && !dayOfWeek.equals("Wednesday")
                && !dayOfWeek.equals("Thursday")
                && !dayOfWeek.equals("Friday")
                && !dayOfWeek.equals("Saturday")
                && !dayOfWeek.equals("Sunday")
                || (!fruit.equals("banana")
                && !fruit.equals("apple")
                && !fruit.equals("orange")
                && !fruit.equals("grapefruit")
                && !fruit.equals("kiwi")
                && !fruit.equals("pineapple")
                && !fruit.equals("grapes"))){
            invalidInput = true;
        }

        else if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
        dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")){
             bananaPrice = 2.50;
             applePrice = 1.20;
             orangePrice = 0.85;
             grapefruitPrice = 1.45;
             kiwiPrice = 2.70;
             pineapplePrice = 5.50;
             grapesPrice = 3.85;
        }

        else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
             bananaPrice = 2.70;
             applePrice = 1.25;
             orangePrice = 0.90;
             grapefruitPrice = 1.60;
             kiwiPrice = 3.00;
             pineapplePrice = 5.60;
             grapesPrice = 4.20;
        }

        if (invalidInput)
            System.out.println("error");

        else {

            double totalPrice = 0;

            switch (fruit){
                case "banana": totalPrice = bananaPrice * quantity;
                    break;
                case "apple": totalPrice = applePrice * quantity;
                    break;
                case "orange": totalPrice = orangePrice * quantity;
                    break;
                case "grapefruit": totalPrice = grapefruitPrice * quantity;
                    break;
                case "kiwi": totalPrice = kiwiPrice * quantity;
                    break;
                case "pineapple": totalPrice = pineapplePrice * quantity;
                    break;
                case "grapes": totalPrice = grapesPrice * quantity;
                    break;

            }

            System.out.printf("%.2f", totalPrice);
        }
    }
}
