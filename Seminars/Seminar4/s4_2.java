package java_gb_23.Seminars.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class s4_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        String command = "";

        while(!command.contains("stop")){
            System.out.println("Введите команду или текст: ");
            command = sc.nextLine();
        
            if(command.contains("print")){
                System.out.println(list.toString());
            } else if(command.contains("remove")){
                System.out.print("Введите индекс объекта для удаления: ");
                int index = sc.nextInt();
                list.remove(index);
                System.out.println(list.toString());
            } else {
                list.add(command);
            }
        }

        sc.close();
    }
}
