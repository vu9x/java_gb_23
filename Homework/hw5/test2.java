package java_gb_23.Homework.hw5;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fName, lName;
        int age;
        double weight;

        System.out.print("Please enter your first name: ");
        fName = sc.nextLine();

        System.out.print("Age: ");
        age = sc.nextInt();

        System.out.print("Weight: ");
        weight = sc.nextDouble();

        System.out.print("Last name: ");
        lName = sc.nextLine();

    }
}
