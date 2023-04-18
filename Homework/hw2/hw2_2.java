package java_gb_23.Homework.hw2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw2_2 {
    public static void main(String[] args) {
        file_reader("hw2_2.txt");
    }

    public static void file_reader(String file_name) {
        BufferedReader reader;
        List<String> list = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(file_name));
            String line = reader.readLine();

			while (line != null) {
                print_sentence(line);
				line = reader.readLine();
			}
			reader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void print_sentence(String line) {
        String[] arr = line.split(",");
        
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String[] elements = arr[i].split(":");
            if(elements[0].contains("фамилия")) {
                sentence.append("Студент ");
                sentence.append(elements[1]);
            } else if (elements[0].contains("оценка")) {
                sentence.append(" получил ");
                sentence.append(elements[1]);
            } else {
                sentence.append(" по предмету ");
                sentence.append(elements[1]);
            }
        }
        
        System.out.println(sentence.toString());
    }
}
