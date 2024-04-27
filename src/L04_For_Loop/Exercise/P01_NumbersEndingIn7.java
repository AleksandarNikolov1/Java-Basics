package L04_For_Loop.Exercise;

import java.util.Scanner;

public class P01_NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 7; i < 1000; i+=10) {
            System.out.println(i);
        }
    }
}
