package java_gb_23.Homework.hw5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw5_1 {
    public static void main(String[] args) {
        String file_name = "hw5_1_phone_book.txt";
        HashMap<String, List<Integer>> phone_book = file_reader(file_name);
        Scanner sc = new Scanner(System.in);
        
        String command = "";
    
        while (!command.contains("stop")) {
            
            System.out.println("Введите команду: \n1. Добавить контакт\n2. Распечатать телефонную книгу\n3. Stop");
            command = sc.nextLine();
        
            if (command.contains("1")) {
                phone_book = add_contact(phone_book);
                file_writer(phone_book, file_name);
            } else if(command.contains("2")){
                print_phonebook(phone_book);
            }
        }

        sc.close();
    }

    public static HashMap<String, List<Integer>> add_contact(HashMap<String, List<Integer>> phone_book) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        System.out.print("Введите номер телефона: ");
        Integer phone = Integer.parseInt(sc.nextLine());

        List<Integer> new_phones = new ArrayList<Integer>();

        if(phone_book.containsKey(name)){
            new_phones = phone_book.get(name);
            new_phones.add(phone);
            phone_book.put(name, new_phones);
        } else {
            new_phones.add(phone);
            phone_book.put(name, new_phones);
        }

        return phone_book;
    }

    public static void print_phonebook(HashMap<String, List<Integer>> phone_book) {
        for (Map.Entry<String, List<Integer>> set: phone_book.entrySet()) {
            System.out.printf("%s: %s\n", set.getKey(), set.getValue().toString());
        }
    }

    public static void file_writer(HashMap<String, List<Integer>> phone_book, String file_name) {
        // File file = new File(file_name);
        
        try {
            // FileWriter writer = new FileWriter(file, false);
            OutputStream outputStream = new FileOutputStream(file_name);
            Writer osw = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter writer = new BufferedWriter(osw);
            for (Map.Entry<String, List<Integer>> set: phone_book.entrySet()) {
                
                String phones = set.getValue().toString();
                StringBuilder phones_strb = new StringBuilder(phones);
                phones_strb.deleteCharAt(0);
                phones_strb.deleteCharAt(phones_strb.length()-1);

                writer.write(set.getKey() + ": " + phones_strb.toString());
                writer.write("\n");
            }
            writer.close();
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static HashMap<String, List<Integer>> file_reader(String file_name) {
        BufferedReader reader;
        HashMap<String, List<Integer>> phone_book = new HashMap<String, List<Integer>>();
        String[] contact_str = new String[2];

        try {
            reader = new BufferedReader(new FileReader(file_name));
            String line = reader.readLine();

			while (line != null) {
                List<Integer> phones = new ArrayList<Integer>();
                contact_str = line.split(": ");
                // StringBuilder phones_strb = new StringBuilder(contact_str[1]);
                // phones_strb.deleteCharAt(0);
                // phones_strb.deleteCharAt(phones_strb.length()-1);
                String[] phones_str = contact_str[1].split(", ");

                for (int i = 0; i < phones_str.length; i++) {
                    phones.add(Integer.parseInt(phones_str[i]));
                }
                phone_book.put(contact_str[0], phones);
                line = reader.readLine();
			}
			reader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phone_book;
    }

}
