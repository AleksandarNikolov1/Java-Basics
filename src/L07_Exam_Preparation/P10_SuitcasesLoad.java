package L07_Exam_Preparation;

import java.util.Scanner;

public class P10_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double capacity = Double.parseDouble(sc.nextLine());
        int counter = 0;
        String input = sc.nextLine();

        while (!input.equals("End")){

            double volume = Double.parseDouble(input);

            counter ++;

            if (counter % 3 == 0)
                volume *= 1.1;

            capacity -= volume;

            if (capacity < 0){
                System.out.println("No more space!");
                counter --;
                break;
            }

            input = sc.nextLine();
        }

        if (capacity >= 0) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.println("Statistic: " + counter + " suitcases loaded.");
    }

}
