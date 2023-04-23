package java_gb_23.Homework.hw5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String file_name = "hw5_1_phone_book.txt";
        BufferedReader reader;
        HashMap<String, List<Integer>> phone_book = new HashMap<String, List<Integer>>();
        String[] contact_str = new String[2];
        List<Integer> phones = new ArrayList<Integer>();

        try {
            reader = new BufferedReader(new FileReader(file_name));
            String line = reader.readLine();

			while (line != null) {
                contact_str = line.split(": ");

                StringBuilder phones_strb = new StringBuilder(contact_str[1]);
                phones_strb.deleteCharAt(0); // удаляем скобку [
                phones_strb.deleteCharAt(phones_strb.length()-1); // удаляем скобку ]
                String[] phones_str = phones_strb.toString().split(","); // Создаем список с разделителем запятая

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

    }
}
