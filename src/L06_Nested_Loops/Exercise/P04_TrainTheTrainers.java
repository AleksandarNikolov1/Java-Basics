package L06_Nested_Loops.Exercise;

import java.util.Scanner;

public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int judgesCount = Integer.parseInt(sc.nextLine());

        String presentationName = sc.nextLine();

        double finalAverageGrade = 0;

        double presentationsCounter = 0;

        while(!presentationName.equals("Finish")){

            double sumPerPresentation = 0;

            presentationsCounter ++;

            for (int i = 0; i < judgesCount; i++) {
                double grade = Double.parseDouble(sc.nextLine());
                sumPerPresentation += grade;
            }

            double averageGrade = sumPerPresentation / judgesCount;

            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);

            finalAverageGrade += averageGrade;

            presentationName = sc.nextLine();
        }

        finalAverageGrade /= presentationsCounter;

        System.out.printf("Student's final assessment is %.2f.", finalAverageGrade);
    }
}
