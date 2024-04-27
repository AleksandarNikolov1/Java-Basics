package L03_Conditional_Statements_Advanced.Lab;

import java.util.Scanner;

public class P08_CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayOfWeek = sc.nextLine();

        int ticketPrice = switch (dayOfWeek){
            case "Monday", "Tuesday", "Friday" -> 12;
            case "Wednesday", "Thursday" -> 14;
            case "Saturday", "Sunday" -> 16;
            default -> -1;
        };

        System.out.println(ticketPrice);
    }
}
