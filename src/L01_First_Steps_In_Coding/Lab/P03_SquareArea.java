package L01_First_Steps_In_Coding.Lab;

import java.util.Scanner;

public class P03_SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int side = Integer.parseInt(sc.nextLine());

        int squareArea = side * side;

        System.out.println(squareArea);
    }
}
