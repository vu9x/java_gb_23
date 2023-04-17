package java_gb_23.Homework.hw2;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class hw2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите число x: ");
        int number_x = sc.nextInt();
        System.out.print("Введите знак: ");
        String sign = sc.next().strip().replace("\n", "");
        System.out.print("Введите число y: ");
        int number_y = sc.nextInt();

        sc.close();

        float number = 0;

        if (sign.contains("+")) {
            number = number_x + number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        } else if (sign.contains("-")) {
            number = number_x - number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        } else if (sign.contains("*")) {
            number = number_x * number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        } else if (sign.contains("/")) {
            number = number_x / number_y;
            System.out.printf(" %d %s %d = %f", number_x, sign, number_y, number);
        }
        
        String file_name = "hw2_3.txt";
        file_writer(file_name, number_x, sign, number_y, number);
    }

        
    /**
     * @param file_name
     * @param number_x
     * @param sign
     * @param number_y
     * @param number
     */
    public static void file_writer(String file_name, int number_x, String sign, int number_y, Float number) {
        File file = new File(file_name);
        String sentence = Integer.toString(number_x) + " " + sign + " " +  Integer.toString(number_y) + " = " + Float.toString(number);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(sentence);
            writer.write("\n");
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}

