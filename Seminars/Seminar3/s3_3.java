/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторериями
 * Вывести название каждой планеты и количество его повторении в списке.
 */
package java_gb_23.Seminars.Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class s3_3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>(Arrays.asList());
        String[] sun_system = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(sun_system.length - 1);
            planets.add(sun_system[a]);
        }

        int count = 1;
        planets.sort(null);
        System.out.println(planets.toString());

        for (int i = 1; i < planets.size(); i++) {
            if(i == planets.size()-1){
                count++;
                System.out.printf("%s - %d\n", planets.get(i-1), count);
            } else if(planets.get(i) == planets.get(i-1)) {
                count++;
            } else {
                System.out.printf("%s - %d\n", planets.get(i-1), count);
                count = 1;
            }

        }
    }
}
