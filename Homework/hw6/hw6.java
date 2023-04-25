package java_gb_23.Homework.hw6;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;
import java.util.HashMap;



public class hw6 {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook(4, 256, "Windows", "White");
        NoteBook notebook2 = new NoteBook(8, 512, "MacOS", "Red");
        NoteBook notebook3 = new NoteBook(1, 1024, "Linux", "Yellow");
        NoteBook notebook4 = new NoteBook(2, 128, "Windows", "Green");

        List<NoteBook> notebooks = new ArrayList<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4));
        System.out.println(notebooks);

        HashMap<Integer, String> userFilter = filter();
        System.out.println(userFilter.toString());

        // HashMap<Integer, String> userFilter = new HashMap<>();
        // userFilter.put(1, "1");
        // userFilter.put(2, "128");
        // userFilter.put(3, "Windows");

        List<NoteBook> filteredNotebook = filterdList(notebooks, userFilter);
        System.out.println(filteredNotebook);
    }

    public static class sortByRam implements Comparator<NoteBook> {
        @Override
        public int compare(NoteBook pc1, NoteBook pc2) {
            // return Integer.compare(pc1.getRam(), pc2.getRam());
            return pc1.getRam().compareTo(pc2.getRam());
        }
    }

    public static class sortByMemory implements Comparator<NoteBook> {
        @Override
        public int compare(NoteBook pc1, NoteBook pc2) {
            // return Integer.compare(pc1.getRam(), pc2.getRam());
            return pc1.getMemory().compareTo(pc2.getMemory());
        }
    }

    public static class sortOS implements Comparator<NoteBook> {
        @Override
        public int compare(NoteBook pc1, NoteBook pc2) {
            // return Integer.compare(pc1.getRam(), pc2.getRam());
            return pc1.getOs().compareTo(pc2.getOs());
        }
    }

    public static class sortColor implements Comparator<NoteBook> {
        @Override
        public int compare(NoteBook pc1, NoteBook pc2) {
            // return Integer.compare(pc1.getRam(), pc2.getRam());
            return pc1.getColor().compareTo(pc2.getColor());
        }
    }
    
    public static HashMap<Integer, String> filter() {
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        List<String> criterias = new ArrayList<>(Arrays.asList("", "ОЗУ", "Объем ЖД", "OS", "Цвет"));
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> userFilter = new HashMap<Integer, String>();
        for (int i = 1; i < 4; i++) {
            System.out.printf("Введите %s: ", criterias.get(i));
            String parameter = sc.nextLine();
            userFilter.put(i, parameter);
        }
        sc.close();
        return userFilter;
    }

    public static List<NoteBook> filterdList(List<NoteBook> notebookList, HashMap<Integer, String> filter) {
        List<NoteBook> answer = new ArrayList<NoteBook>();
        for (NoteBook i : notebookList) {
            if(i.getRam() >= Integer.parseInt(filter.get(1)) && i.getMemory() >= Integer.parseInt(filter.get(2)) && i.getOs().contains(filter.get(3))){
                answer.add(i);
            }
        }
        return answer;
    }
}


