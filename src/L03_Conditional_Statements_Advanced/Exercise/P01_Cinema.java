package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P01_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String projectionType = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());

        double ticketPrice = 0;

        switch (projectionType) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        double income = rows * columns * ticketPrice;

        System.out.printf("%.2f leva", income);
    }
}
