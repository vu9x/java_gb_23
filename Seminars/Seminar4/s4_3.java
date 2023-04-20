package java_gb_23.Seminars.Seminar4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class s4_3 {
    public static void main(String[] args) {
        Deque<String>  dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String str = "";

        do{
            System.out.println("Введите текст: ");
            str = sc.nextLine();
            if (str.contains("print")) {
                for (int i = dq.size(); i > 0; i--) {
                    System.out.println(dq.removeLast());
                }
                System.out.println(dq.toString());
            } else {
                dq.add(str);
            }
        } while(!str.contains("stop"));

        sc.close();
    } 
}
