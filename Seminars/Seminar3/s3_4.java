/*
 * Создать список типа ArrayList
 * Поместить в него как строки, так и целые числа
 * Пройтись по спискку, найти и удалить целые числа
 */
package java_gb_23.Seminars.Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class s3_4 {
     public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList("Меркурий", 1, "Венера", 2, "Земля", 4));
        // Iterator<Object> iter = list.iterator();
        Iterator<Object> iter = list.iterator();
        
        while (iter.hasNext()) {
            if(iter.next() instanceof Integer) {
                iter.remove();
            }
        }
        System.out.println(list);
     }
}
