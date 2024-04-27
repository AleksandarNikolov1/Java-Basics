package L06_Nested_Loops.Lab;

import java.util.Scanner;

public class P07_CinemaTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int standardTicketsCounter = 0;
        int studentTicketsCounter = 0;
        int kidTicketsCounter = 0;

        int totalTickets = 0;

        boolean isFinished = false;

        String movieName = sc.nextLine();

        while (!(movieName.equals("Finish"))) {

            int freeSeats = Integer.parseInt(sc.nextLine());
            String ticketType = sc.nextLine();

            int totalTicketsCounter = 0;

            while (freeSeats -- > 0) {

                switch (ticketType) {
                    case "standard":
                        standardTicketsCounter++;
                        break;
                    case "student":
                        studentTicketsCounter++;
                        break;
                    case "kid":
                        kidTicketsCounter++;
                        break;
                }

                totalTicketsCounter++;

                ticketType = sc.nextLine();

                if (ticketType.equals("End"))
                    break;
            }

            totalTickets += totalTicketsCounter;

            double percentPerFilm = (double) totalTicketsCounter / (double) freeSeats * 100;

            System.out.printf("%s - %.2f%% full.%n", movieName, percentPerFilm);

            movieName = sc.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);

        double studentPercent = (100.0 / totalTickets ) * studentTicketsCounter;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);

        double standardPercent = (100.0 / totalTickets) * standardTicketsCounter;
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);

        double kidPercent = (100.0 / totalTickets) * kidTicketsCounter;
        System.out.printf("%.2f%% kids tickets.", kidPercent);
    }

}
