package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double points = Integer.parseInt(sc.nextLine());
        double bonusPoints = 0;

        if (points <= 100)
            bonusPoints = 5;

        else if (points > 100 && points < 1000)
            bonusPoints = points * 0.2;

        else if (points > 1000)
            bonusPoints = points * 0.1;

        if (points % 2 == 0)
            bonusPoints += 1;

        if (points % 10 == 5)
            bonusPoints += 2;

        double totalPoints = points + bonusPoints;

        System.out.printf("%.1f%n%.1f", bonusPoints, totalPoints);
    }
}
