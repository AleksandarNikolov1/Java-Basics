package L06_Nested_Loops.Exercise;

import java.util.Scanner;

public class P05_PasswordsGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int l = Integer.parseInt(sc.nextLine());

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < n; j++) {
                for (int k = 97; k < 97 + l; k++) {
                    char c = (char) k;
                    for (int m = 97; m < 97 + l; m++) {
                        char ch = (char) m;
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                sb.append(i);
                                sb.append(j);
                                sb.append(c);
                                sb.append(ch);
                                sb.append(o);

                                System.out.print(sb.toString() + " ");

                            }
                            sb.setLength(0);
                        }
                    }
                }
            }
        }
    }
}

// 11aa2 11ab2 11ac2 11ad2 11ba2 11bb2 11bc2 11bd2 11ca2 11cb2 11cc2 11cd2 11da2 11db2 11dc2 11dd2

//Символ 1: цифра от 1 до n.
//
//        · Символ 2: цифра от 1 до n.
//
//        · Символ 3: малка буква измежду първите l букви на латинската азбука.
//
//        · Символ 4: малка буква измежду първите l букви на латинската азбука.
//
//        · Символ 5: цифра от 1 до n, по-голяма от първите 2 цифри.