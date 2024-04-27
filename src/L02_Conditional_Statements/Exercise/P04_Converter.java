package L02_Conditional_Statements.Exercise;

import java.util.Scanner;

public class P04_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = Double.parseDouble(sc.nextLine());
        String unitFrom = sc.nextLine();
        String unitTo = sc.nextLine();

        double output = 0;

        switch (unitFrom){
            case "mm":
                if (unitTo.equals("cm"))
                    output = input / 10;

                else if (unitTo.equals("m"))
                    output = input / 1000;
                break;

            case "cm":
                if (unitTo.equals("mm"))
                    output = input * 10;

                else if (unitTo.equals("m"))
                    output = input / 100;
                break;

            case "m":
                if (unitTo.equals("mm"))
                    output = input * 1000;

                else if (unitTo.equals("cm"))
                    output = input * 100;
                break;

            default:
                output = input;
        }

        System.out.printf("%.3f", output);
    }

}
