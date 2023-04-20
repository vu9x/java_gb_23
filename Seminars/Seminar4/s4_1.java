/*
 * 1. Замерьте время, за которое ArrayList добавляет 100к элементов
 * 2. Замерьте время, за которое LinkedList добавляет 100к элементов
 */
package java_gb_23.Seminars.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class s4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        long startA = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrList.add(0, i);
        }
        long stopA = System.currentTimeMillis();
        System.out.println(stopA - startA);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long startL = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(0, i);
        }
        long stopL = System.currentTimeMillis();
        System.out.println(stopL - startL);

    }
}
