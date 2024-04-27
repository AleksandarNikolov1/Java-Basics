package L06_Nested_Loops.Exercise;

import java.util.Scanner;

public class P03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;

        while (!input.equals("stop")){
            int num = Integer.parseInt(input);

            if (num < 0){
                System.out.println("Number is negative.");
                input = sc.nextLine();
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                primeNumbersSum += num;

            else
                nonPrimeNumbersSum += num;

            input = sc.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + primeNumbersSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeNumbersSum);
    }
}
