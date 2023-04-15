/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * а так же n! (произведение чисел от 1 до n)
 */

package java_gb_23.Homework.hw1;

import java.util.Scanner;

/**
 * hw1_1_15-04
 */
public class hw1_1_15_04 {
    public static void main(String[] args) {
        System.out.println("Впишите цифру N");
        Scanner sc = new Scanner(System.in);
        int n_number = sc.nextInt();
        int n_sum = 0;
        int n_multiplier = 1;

        for (int i = 1; i <= n_number; i++) {
            n_sum += i;
            n_multiplier *= i;
        }

        System.out.printf("Сумма чисел от 1 до %d = %d\n", n_number, n_sum);
        System.out.printf("Произведение чисел от 1 до %d = %d", n_number, n_multiplier);
        
    }
    
}