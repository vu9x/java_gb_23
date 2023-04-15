/*
 * Вывести все простые числа от 1 до 1000
 */

package java_gb_23.Homework.hw1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hw1_2_15_04 {
    public static void main (String[] args) {
        System.out.println("Введите число и мы найдем все простые числа до него: ");
        Scanner cr = new Scanner(System.in);
        

    }

    public List<Integer> getPrimeNumbers(int arrSize){
        var arrBool = new boolean[arrSize];
        Arrays.fill(arrBool, true);
        arrBool[0] = false;
        arrBool[1] = false;

        for (int i = 0; i < arrBool.length; i++) {
            if (arrBool[i]) {
                for (int j = 0; j < arrBool.length; j++) {
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
