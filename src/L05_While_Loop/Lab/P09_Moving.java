package L05_While_Loop.Lab;

import java.util.Scanner;

public class P09_Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());

        int freeSpace = width * length * height;

        String input = sc.nextLine();

        int sumOfCartons = 0;

        boolean noFreeSpace = false;

        while (!input.equals("Done")){
            int cartons = Integer.parseInt(input);
            sumOfCartons += cartons;

            if (sumOfCartons >= freeSpace){
                noFreeSpace = true;
                break;
            }

            input = sc.nextLine();
        }



        if (noFreeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", sumOfCartons - freeSpace);
        }

        else
            System.out.printf("%d Cubic meters left.", freeSpace - sumOfCartons);
    }
}
