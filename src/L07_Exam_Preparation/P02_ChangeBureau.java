package L07_Exam_Preparation;

import java.util.Scanner;

public class P02_ChangeBureau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bitcoin = Integer.parseInt(sc.nextLine());
        double chineseYuan = Double.parseDouble(sc.nextLine());
        double commission = Double.parseDouble(sc.nextLine()) / 100;

        double bitcoinToBgn = bitcoin * 1168;
        double chineseYuanToUsd = chineseYuan * 0.15;
        double usdToBgn = 1.76;
        double euroToBgn = 1.95;

        double bitcoinToEuro = bitcoinToBgn / euroToBgn;
        double chineseYuanToEuro = (chineseYuanToUsd * usdToBgn) / euroToBgn;

        double euro = (bitcoinToEuro + chineseYuanToEuro) * (1 - commission);

        System.out.printf("%.2f", euro);

    }
}

//         1 биткойн = 1168 лева.
//         1 китайски юан = 0.15 долара.
//         1 долар = 1.76 лева.
//         1 евро = 1.95 лева.
//        Обменното бюро има комисионна от 0 до 5 процента от крайната сума в евро.
//        Вход
//        От конзолата се четат 3 числа:
//         На първия ред – броят биткойни. Цяло число в интервала [0…20]
//         На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
//         На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]