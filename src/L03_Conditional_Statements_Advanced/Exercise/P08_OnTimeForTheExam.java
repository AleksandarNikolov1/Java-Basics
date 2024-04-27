package L03_Conditional_Statements_Advanced.Exercise;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int examHour = Integer.parseInt(sc.nextLine());
        int examMinutes = Integer.parseInt(sc.nextLine());
        int arrivalHour = Integer.parseInt(sc.nextLine());
        int arrivalMinutes = Integer.parseInt(sc.nextLine());

        if (examHour == 0)
            examHour = 24;

        if (arrivalHour == 0)
            arrivalHour = 24;


        int examTotalMinutes = examHour * 60 + examMinutes;
        int arrivalTotalMinutes = arrivalHour * 60 + arrivalMinutes;

        int diff = Math.abs(examTotalMinutes - arrivalTotalMinutes);

        String output = "";

        if (examTotalMinutes > arrivalTotalMinutes){
            if (diff <= 30)
                output = String.format("On time%n%d minutes before the start", diff);

            else if (diff > 30 && diff < 60)
                output = String.format("Early%n%d minutes before the start", diff);

            else {
                int h = diff / 60;
                int m = diff - 60 * h;

                if (m < 10)
                    output = String.format("Early%n%d:0%d hours before the start", h, m);

                else
                    output = String.format("Early%n%d:%d hours before the start", h, m);
            }
        }

        else if (examTotalMinutes < arrivalTotalMinutes){

           if (diff < 60)
                output = String.format("Late%n%d minutes after the start", diff);

            else {
                int h = diff / 60;
                int m = diff - 60 * h;

                if (m < 10)
                   output = String.format("Late%n%d:0%d hours after the start", h, m);

                else
                   output = String.format("Late%n%d:%d hours after the start", h, m);
            }
        }

        else
            output = "On time";


        System.out.println(output);
    }
}
