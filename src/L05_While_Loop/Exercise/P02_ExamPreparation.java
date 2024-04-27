package L05_While_Loop.Exercise;

import java.util.Scanner;

public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int badGradesCount = Integer.parseInt(sc.nextLine());
        int badGradesCounter = 0;
        double gradesSum = 0;
        int gradesCounter = 0;

        boolean isBroken = false;

        String lastTask = "";

        String task = sc.nextLine();



        while (!task.equals("Enough")){

            double grade = Double.parseDouble(sc.nextLine());

            gradesCounter++;
            gradesSum += grade;

            if (grade <= 4){
                badGradesCounter++;
                if (badGradesCounter == badGradesCount){
                    isBroken = true;
                    break;
                }
            }

            lastTask = task;

            task = sc.nextLine();
        }

        if (isBroken)
            System.out.printf("You need a break, %d poor grades.", badGradesCounter);

        else {
            double averageGrade = gradesSum / gradesCounter;
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", averageGrade, gradesCounter, lastTask);
        }

    }
}
