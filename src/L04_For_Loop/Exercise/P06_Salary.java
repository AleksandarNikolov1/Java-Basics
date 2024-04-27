package L04_For_Loop.Exercise;

import java.util.Scanner;

public class P06_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int openTabs = Integer.parseInt(sc.nextLine());
        double salary = Double.parseDouble(sc.nextLine());

        boolean salaryIsLost = false;

        for (int i = 0; i < openTabs; i++) {
            String websiteName = sc.nextLine();

            switch (websiteName) {
                case "Facebook": salary -= 150;
                break;
                case "Instagram": salary -= 100;
                break;
                case "Reddit": salary -= 50;
                break;
            }

            if (salary <= 0){
                salaryIsLost = true;
                break;
            }
        }

        if (salaryIsLost)
            System.out.println("You have lost your salary.");

        else
            System.out.printf("%.0f", salary);
    }
}
