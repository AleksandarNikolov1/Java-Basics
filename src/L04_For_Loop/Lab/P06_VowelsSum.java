package L04_For_Loop.Lab;

import java.util.Scanner;

public class P06_VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int value = 0;
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)){
                case 'a': value = 1;
                    break;
                case 'e': value = 2;
                    break;
                case 'i': value = 3;
                    break;
                case 'o': value = 4;
                    break;
                case 'u': value = 5;
                    break;
                default: value = 0;
            };

            sum += value;
        }

        System.out.println(sum);
    }
}
