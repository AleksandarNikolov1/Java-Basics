package L01_First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P05_GreetingByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}
