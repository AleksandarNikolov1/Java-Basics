package L05_While_Loop.Exercise;

import java.util.Scanner;

public class P05_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        int coins = (int) (money * 100);
        int coinsCounter = 0;

        while (coins > 0){
            if (coins >= 200){
                coins -= 200;
                coinsCounter++;
            }
            else if (coins >= 100){
                coins -= 100;
                coinsCounter++;
            }
            else if (coins >= 50){
                coins -= 50;
                coinsCounter++;
            }
            else if (coins >= 20){
                coins -= 20;
                coinsCounter++;
            }
            else if (coins >= 10){
                coins -= 10;
                coinsCounter++;
            }
            else if (coins >= 5){
                coins -= 5;
                coinsCounter++;
            }
            else if (coins >= 2){
                coins -= 2;
                coinsCounter++;
            }
            else {
                coins -= 1;
                coinsCounter++;
            }
        }

        System.out.println(coinsCounter);
    }
}
