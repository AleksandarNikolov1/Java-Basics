package L02_Conditional_Statements.Lab;

import java.util.Scanner;

public class P06_AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String shape = sc.nextLine();
        double area = 0;

        switch (shape){
            case "square":
                double a = Double.parseDouble(sc.nextLine());
                area = a * a;
                break;
            case "rectangle":
                a = Double.parseDouble(sc.nextLine());
                double b = Double.parseDouble(sc.nextLine());
                area = a * b;
                break;
            case "circle":
                double r = Double.parseDouble(sc.nextLine());
                area = Math.PI * Math.pow(r,2);
                break;
            case "triangle":
                a = Double.parseDouble(sc.nextLine());
                double h = Double.parseDouble(sc.nextLine());
                area = (a * h) / 2;
                break;
        }

        System.out.printf("%.3f", area);
    }
}
