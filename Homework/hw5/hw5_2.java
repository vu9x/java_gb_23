package java_gb_23.Homework.hw5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class hw5_2 {
    public static void main(String[] args) {
        String file_name = "hw5_2.txt";
        List<String> listName = file_reader(file_name);

        HashMap<String, Integer> contacts = new HashMap<String, Integer>();
        contacts = nameCounter(listName);

        LinkedHashMap<String, Integer> sortedContacts = reversedOrder(contacts);
        for (Map.Entry<String, Integer> contact : sortedContacts.entrySet()) {
            System.out.println(contact.getValue() + ": " + contact.getKey());
        }

    }

    public static List<String> file_reader(String file_name) {
        BufferedReader reader;
        List<String> phone_book = new ArrayList<String>();
        String[] contact_str = new String[2];

        try {
            reader = new BufferedReader(new FileReader(file_name));
            String line = reader.readLine();

			while (line != null) {
                contact_str = line.split(" ");
                phone_book.add(contact_str[0]);
                line = reader.readLine();
			}
			reader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phone_book;
    }

    public static HashMap<String, Integer> nameCounter(List<String> listName) {
        HashMap<String, Integer> contacts = new HashMap<String, Integer>();
        for (int i = 0; i < listName.size(); i++) {
            if(contacts.containsKey(listName.get(i))){
                contacts.put(listName.get(i), contacts.get(listName.get(i)) + 1);
            } else {
                contacts.put(listName.get(i), 1);
            }
        }
        return contacts;
    }

    public static LinkedHashMap<String, Integer> reversedOrder (HashMap<String, Integer> contacts) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(contacts.entrySet());

        // Sort the list
        Comparator<Map.Entry<String, Integer>> cmp = new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        };

        Collections.sort(list, Collections.reverseOrder(cmp));

        LinkedHashMap<String, Integer> sortedContacts = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> temp: list){
            sortedContacts.put(temp.getKey(), temp.getValue());
        }
        return sortedContacts;
    }
}
