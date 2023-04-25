import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}. Распечатайте содержимое данного множества.
 * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
 * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.  Распечатайте содержимое данного множества.
 */
public class s6_1 {
    public static void main(String[] args) {
        HashSet<Integer> hS = new HashSet<Integer>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        LinkedHashSet<Integer> lHS = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        TreeSet<Integer> tS = new TreeSet<Integer>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));

        System.out.println(hS.toString());
        System.out.println(lHS.toString());
        System.out.println(tS.toString());
    }
}
