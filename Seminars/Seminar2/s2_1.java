

package java_gb_23.Seminars.Seminar2;

import java.util.Scanner;

public class s2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int number = sc.nextInt();
        System.out.print("Введите первый символ: ");
        String firstChar = sc.next();
        System.out.print("Введите второй символ: ");
        String secondChar = sc.next();
        sc.close();

        StringBuilder result = builder(number, firstChar, secondChar);
        System.out.println(result);

    }

    public static StringBuilder builder(int number, String firstChar, String secondChar) {
        StringBuilder str = new StringBuilder();
        if (number % 2 == 0) {
            for (int i = 0; i < number / 2; i++) {
                str.append(firstChar);
                str.append(secondChar);
            }
            return str;
        } else {
            return str.append("Вы ввели не четное число");
        }
        
    }
}
