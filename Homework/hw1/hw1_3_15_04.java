/*
 * Реализовать простой калькулятор (+ - / *)
 * Ввод числа ->
 * Ввод знака ->
 * Ввод числа ->


 */
package java_gb_23.Homework.hw1;

import java.util.Scanner;

public class hw1_3_15_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите число x: ");
        int number_x = sc.nextInt();
        System.out.print("Введите знак: ");
        String sign = sc.next().strip().replace("\n", "");
        System.out.print("Введите число y: ");
        int number_y = sc.nextInt();

        float number = 0;
        // String sign_plus = "+";
        // String sign_minus = "-";
        // String sign_multi = "/";
        // String sign_divide = "*";

        if (sign.contains("+")) {
            number = number_x + number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        } else if (sign.contains("-")) {
            number = number_x - number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        } else if (sign.contains("*")) {
            number = number_x * number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        } else if (sign.contains("/")) {
            number = number_x / number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        }

        sc.close();
    }
}
