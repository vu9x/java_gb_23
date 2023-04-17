/*
 * Напишите метод, котоырй сжимает строку
 */
package java_gb_23.Seminars.Seminar2;

import java.util.Scanner;

public class s2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите вашу строку: ");
        String str = sc.next();
        sc.close();

        StringBuilder answer = builder(str);
        System.out.println(answer);
    }

    public static StringBuilder builder(String str) {
        StringBuilder result = new StringBuilder();
        char[] strArray = str.toCharArray();
        int strLen = 0;
        while (strLen < strArray.length) {
            int counter = 1;
            result.append(strArray[strLen]);
            for (int i = strLen + 1; i < strArray.length; i++) {
                if (strArray[i] == strArray[i - 1]){
                    counter++;
                } else {
                    break;
                }
                strLen++;
            }

            if(counter == 1){
                result.append("");
            } else {
                result.append(counter);
            }
            strLen++;
        }
        return result;
    }
}
