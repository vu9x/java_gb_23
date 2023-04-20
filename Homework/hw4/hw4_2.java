/*
 * 2) Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

package java_gb_23.Homework.hw4;

import java.util.LinkedList;

public class hw4_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("a");
        list.add("b");
        System.out.println(list.toString());

        enqueue(list, "c");
        enqueue(list, "d");
        System.out.println(list.toString());

        dequeue(list);
        System.out.println(list.toString());

        String first = first(list);
        System.out.println(first);
        System.out.println(list.toString());
    }

    public static LinkedList<String> enqueue(LinkedList<String> list, String element) {
        list.addLast(element);
        return list;
    }

    public static LinkedList<String> dequeue(LinkedList<String> list) {
        list.removeFirst();
        return list;
    }
    
    public static String first(LinkedList<String> list) {
        return list.getFirst();
    }
}
