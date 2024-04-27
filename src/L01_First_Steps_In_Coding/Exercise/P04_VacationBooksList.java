package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pagesCount = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int pagesPerDay =  (pagesCount / pagesPerHour) / days;

        System.out.println(pagesPerDay);
    }
}
