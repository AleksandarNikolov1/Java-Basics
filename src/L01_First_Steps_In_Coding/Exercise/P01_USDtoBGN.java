package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P01_USDtoBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdToBgn = 1.79549;

        double usd = Double.parseDouble(sc.nextLine());

        double bgn = usd * usdToBgn;

        System.out.println(bgn);
    }
}
