package L01_First_Steps_In_Coding.Exercise;

import java.util.Scanner;

public class P08_FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine()) / 100;

        double neededLitersWater = ((length * width * height) * 0.001) * (1 - percent);
        System.out.printf("%.2f", neededLitersWater);

    }
}
