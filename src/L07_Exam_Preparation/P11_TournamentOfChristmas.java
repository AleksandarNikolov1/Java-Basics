package L07_Exam_Preparation;

import java.util.Scanner;

public class P11_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());

        double money = 0;
        double totalMoney = 0;

        int winsCounter = 0;
        int losesCounter = 0;

        int daysWhenWin = 0;
        int daysWhenLose = 0;


        for (int i = 0; i < days; i++) {

            String sport = sc.nextLine();

            while (!sport.equals("Finish")){

                String result = sc.nextLine();

                if (result.equals("win")) {
                    money += 20;
                    winsCounter ++;
                }
                else if (result.equals("lose"))
                    losesCounter ++;

                sport = sc.nextLine();
            }

            if (winsCounter > losesCounter) {
                money *= 1.1;
                totalMoney += money;
                daysWhenWin ++;
            }

            else {
                totalMoney += money;
                daysWhenLose++;
            }

            losesCounter = 0;
            winsCounter = 0;
            money = 0;
        }

        if (daysWhenWin > daysWhenLose) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }
        else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
