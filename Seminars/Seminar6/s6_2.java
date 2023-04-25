import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
 * 1. Напишите метод, который заполнит массив из 110 элементов случайными цифрами от 0 до 70.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
 * значений в данном массиве и верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */

public class s6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> original = randList();
        System.out.println(original);

        Double unique = perOfUnique(original);
        System.out.println(unique);
    }
    public static ArrayList<Integer> randList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        Integer listLength = 110;
        for (int i = 0; i < listLength; i++) {
            list.add(rand.nextInt(0, 71));
        }
        return list;
    }

    public static Double perOfUnique(ArrayList<Integer> original) {
        HashSet<Integer> uniqueList = new HashSet<>(original);
        Double uniqueSize = Double.valueOf(uniqueList.size());
        Double orSize = Double.valueOf(original.size());
        Double result = uniqueSize * 100 / orSize;

        return result;
    }
}
