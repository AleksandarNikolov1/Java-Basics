package L05_While_Loop.Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(sc.nextLine());
        double balance = Double.parseDouble(sc.nextLine());

        int daysWhenSpendCounter = 0;
        int daysCounter = 0;

        boolean isBroken = false;



        while (balance < vacationPrice){
            String command = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());

            daysCounter++;

            if (command.equals("save")){
                balance += amount;
                daysWhenSpendCounter = 0;
            }

            else if (command.equals("spend")){
                daysWhenSpendCounter++;
                if (daysWhenSpendCounter == 5){
                    isBroken = true;
                    break;
                }
                else {
                    balance -= amount;
                    if (balance < 0)
                        balance = 0;
                }
            }
        }

        if (isBroken)
            System.out.printf("You can't save the money.%n%d", daysCounter);

        else
            System.out.printf("You saved the money for %d days.", daysCounter);

    }
}
