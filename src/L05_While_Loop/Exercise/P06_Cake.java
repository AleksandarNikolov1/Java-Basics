package L05_While_Loop.Exercise;

import java.util.Scanner;

public class P06_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(sc.nextLine());
        int cakeLength = Integer.parseInt(sc.nextLine());

        int cakeArea = cakeWidth * cakeLength;

        boolean isNotEnough = false;

        String input = sc.nextLine();

        int sumOfTakenPieces = 0;
        while (!input.equals("STOP")){

            int takenPieces = Integer.parseInt(input);
            sumOfTakenPieces += takenPieces;

            if (sumOfTakenPieces >= cakeArea){
                isNotEnough = true;
                break;
            }

            input = sc.nextLine();
        }

        int diff = Math.abs(cakeArea - sumOfTakenPieces);

        if (isNotEnough)
            System.out.printf("No more cake left! You need %d pieces more.", diff);

        else
            System.out.printf("%d pieces are left.", diff);
    }
}
