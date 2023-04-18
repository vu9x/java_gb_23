/*
 * 1. (Дополнительное) Реализовать алгоритм сортировки слиянием
 * 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
 * 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
 */
package java_gb_23.Homework.hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class hw3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getRandomArray(10);
        System.out.printf("Original list is: %s\n", list.toString());

        getOddList(list);
        System.out.printf("We have removed all even numbers. New list is: %s\n", list.toString());



    }

    public static ArrayList<Integer> getRandomArray(int arrLen) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < arrLen; i++) {
            result.add(rand.nextInt(100));
        }
        return result;
        
    }

    public static ArrayList<Integer> getOddList(ArrayList<Integer> list) {
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
        return list;
    }

}
