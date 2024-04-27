package L05_While_Loop.Lab;

import java.util.Scanner;

public class P04_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int nextNum = 1;

        while (nextNum <= n){
            System.out.println(nextNum);
            nextNum = (nextNum * 2) + 1;
        }
    }
}
