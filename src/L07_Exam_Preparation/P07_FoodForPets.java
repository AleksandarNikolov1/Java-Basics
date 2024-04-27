package L07_Exam_Preparation;

import java.util.Scanner;

public class P07_FoodForPets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        double foodQuantity = Double.parseDouble(sc.nextLine());

        int commonEatenFood = 0;

        double eatenBiscuits = 0;

        int counter = 0;

        int dogsEatenFoodForAllDays = 0;
        int catsEatenFoodForAllDays = 0;

        while (days -- > 0){
            int dogsEatenFood = Integer.parseInt(sc.nextLine());
            int catEatenFood = Integer.parseInt(sc.nextLine());

            commonEatenFood += dogsEatenFood + catEatenFood;

            counter++;

            if (counter % 3 == 0){
                double eatenFoodPerDay = dogsEatenFood + catEatenFood;
                eatenBiscuits += eatenFoodPerDay * 0.1;
            }

            dogsEatenFoodForAllDays += dogsEatenFood;
            catsEatenFoodForAllDays += catEatenFood;
        }

        double dogsEatenFoodPercent = Double.valueOf(dogsEatenFoodForAllDays) / Double.valueOf(commonEatenFood) * 100;
        double catsEatenFoodPercent = Double.valueOf(catsEatenFoodForAllDays) / Double.valueOf(commonEatenFood) * 100;

        double eatenFoodPercent = (commonEatenFood / foodQuantity) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", (int) eatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", eatenFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", dogsEatenFoodPercent);
        System.out.printf("%.2f%% eaten from the cat.", catsEatenFoodPercent);


    }
}
