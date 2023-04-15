package java_gb_23.Seminars.Seminar1;

import java.util.Scanner;

public class s1_1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        int age = sc.nextInt();
        String name = sc.next();
        System.out.println(age);
        System.out.println(name);
        sc.close();
    }
}
