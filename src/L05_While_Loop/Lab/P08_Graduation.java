package L05_While_Loop.Lab;

import java.util.Scanner;

public class P08_Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int grade = 0;
        int broken = 0;

        boolean isBroken = false;

        double averageAssessment = 0;

        while (grade < 12){
            double assessment = Double.parseDouble(sc.nextLine());

            if (assessment < 4) {
                broken++;
                if (broken == 2) {
                    isBroken = true;
                    break;
                }
            }

            averageAssessment += assessment;

            grade++;
        }



        if (isBroken)
            System.out.printf("%s has been excluded at %d grade", name, grade);

        else {
            averageAssessment /= grade;
            System.out.printf("%s graduated. Average grade: %.2f",name, averageAssessment);
        }
    }
}
