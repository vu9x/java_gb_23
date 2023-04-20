package java_gb_23.Homework.hw4;

import java.util.ArrayList;
import java.util.LinkedList;

public class hw4_1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        LinkedList<String> answer = reversedList(list);
        System.out.println(answer);

    }

    public static LinkedList<String> reversedList(LinkedList<String> originalList) {
        LinkedList<String> result = new LinkedList<String>();
        while (!originalList.isEmpty()) {
            result.add(originalList.removeLast());
        }
        return result;
    }
}
