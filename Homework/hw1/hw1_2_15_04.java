/*
 * Вывести все простые числа от 1 до 1000
 */

package java_gb_23.Homework.hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hw1_2_15_04 {
    public static void main (String[] args) {
        int user_number = getUserNumber();
        List<Integer> primes_answer = getPrimeNumbers(user_number);
        System.out.println(primes_answer);
    }

    public static int getUserNumber(){
        System.out.println("Введите число и мы найдем все простые числа до него: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        return number;
    }

    public static List<Integer> getPrimeNumbers(int arrSize){
        boolean[] arrBool = new boolean[arrSize];
        Arrays.fill(arrBool, true);
        arrBool[0] = false;
        arrBool[1] = false;

        for (int i = 0; i < arrBool.length; i++) {
            if (arrBool[i]) {
                for (int j = 2; i * j < arrBool.length; j++ ) {
                    // System.out.printf("i = %d, j = d%, i * j = d%", i * j);
                    arrBool[i * j] = false;

                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < arrBool.length; i++) {
            if (arrBool[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}
