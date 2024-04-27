package L07_Exam_Preparation;

import java.util.Scanner;

public class P08_TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groupsCount = Integer.parseInt(sc.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        while (groupsCount-- > 0){
            int people = Integer.parseInt(sc.nextLine());

            if (people <= 5)
                p1 += people;

            else if (people > 5 && people <= 12)
                p2 += people;

            else if (people > 12 && people <= 25)
                p3 += people;

            else if (people > 25 && people <= 40)
                p4 += people;

            else if (people > 40)
                p5 += people;
        }

        int allPeople = p1 + p2 + p3 + p4 + p5;

        double r1 = (double) p1 / (double) allPeople * 100;
        double r2 = (double) p2 / (double) allPeople * 100;
        double r3 = (double) p3 / (double) allPeople * 100;
        double r4 = (double) p4 / (double) allPeople * 100;
        double r5 = (double) p5 / (double) allPeople * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n",
                r1, r2, r3, r4, r5);
    }
}
