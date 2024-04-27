package L06_Nested_Loops.Lab;

import java.util.Scanner;

public class P06_Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int floors = Integer.parseInt(sc.nextLine());
        int rooms = Integer.parseInt(sc.nextLine());

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d ", i, j);
                }
                else if (i % 2 == 1) {
                    System.out.printf("A%d%d ", i, j);
                }
                else {
                    System.out.printf("O%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
