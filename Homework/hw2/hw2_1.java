/*
 * 1. Реализуйте алгоритм сортировки пузырьком числового массива 
 * (введён вами), результат после каждой итерации запишите в лог-файл.
 */
package java_gb_23.Homework.hw2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class hw2_1 {
    public static void main(String[] args) {
        // find path -> String path (fine_name)
        // buble sorter -> void (String file_path, int[] Array)
        // file writer -> void (int[] Array)

        // int[] arr = {11, 3, 14, 16, 7};

        int[] arr = user_array();
        String file_name = "hw2_1.txt";
        buble_sorter(file_name, arr);
        
    }

    public static int[] user_array() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер вашего массива: ");
        int arr_length = sc.nextInt();
        int[] arr = new int[arr_length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент вашего массива: ");
            arr[i] = sc.nextInt();    
        }

        sc.close();

        return arr;
    }

    public static void buble_sorter(String file_name, int[] mas) {
        boolean isSorted = false;
        int buf;
        int counter = 1;

        while(!isSorted) {
            isSorted = true;
            file_writer(file_name, mas, counter);

            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
                
            }
            counter++;
        }

    }
    
    public static void file_writer(String file_name, int[] arr, int counter) {
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(counter + "." + Arrays.toString(arr));
            writer.write("\n");
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
