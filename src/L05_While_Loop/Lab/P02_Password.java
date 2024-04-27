package L05_While_Loop.Lab;

import java.util.Scanner;

public class P02_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String password = sc.nextLine();

        String input = sc.nextLine();

        while (!input.equals(password)){
            input = sc.nextLine();
        }

        System.out.println("Welcome " + name + "!");
    }
}
