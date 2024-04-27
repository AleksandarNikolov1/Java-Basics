package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P09_Volleyball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String yearType = sc.nextLine();
        int holidaysCount = Integer.parseInt(sc.nextLine());
        int weekendsInVillageCount = Integer.parseInt(sc.nextLine());
        int totalWeekendsCount = 48;

        int weekendsInSofiaCount = totalWeekendsCount - weekendsInVillageCount;

        double volleyballGames = 0;

        volleyballGames = (double) (weekendsInSofiaCount * (3.0 / 4.0) + holidaysCount * (2.0 / 3.0)
                + weekendsInVillageCount);

        if (yearType.equals("leap"))
             volleyballGames *= 1.15;

        System.out.println(Integer.valueOf((int) volleyballGames));
    }
}
