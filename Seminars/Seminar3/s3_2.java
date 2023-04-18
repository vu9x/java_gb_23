/*
 * Заполнить список десятью случайными числами,
 * и вывести на экран
 */
package java_gb_23.Seminars.Seminar3;

import java.util.ArrayList;
import java.util.Random;

public class s3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(100);
            lst.add(a);
            
        }
        System.out.println(lst.toString());
        lst.sort(null);
        System.out.println(lst.toString());
    }
}
