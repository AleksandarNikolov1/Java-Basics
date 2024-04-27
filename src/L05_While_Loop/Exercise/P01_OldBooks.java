package L05_While_Loop.Exercise;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String book = sc.nextLine();

        String input = sc.nextLine();

        boolean isFound = false;

        int booksCount = 0;

        while (!input.equals("No More Books")){

            if (input.equals(book)){
                isFound = true;
                break;
            }

            booksCount++;
            input = sc.nextLine();
        }

        if (isFound)
            System.out.printf("You checked %d books and found it.", booksCount);

        else
            System.out.printf("The book you search is not here!%nYou checked %d books.", booksCount);


    }
}
