package L05_While_Loop.Lab;

import java.util.Scanner;

public class P03_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (sum < n){
            int num = Integer.parseInt(sc.nextLine());
            sum += num;
        }

        System.out.println(sum);
    }
}
