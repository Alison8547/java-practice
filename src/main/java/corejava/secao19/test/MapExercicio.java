package corejava.secao19.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path file:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            Map<String, Integer> map = new HashMap<>();

            while (line != null) {
                String[] lines = line.split(",");
                String key = lines[0];
                int value = Integer.parseInt(lines[1]);
                if (map.containsKey(key)) {
                    int count = map.get(key);
                    map.put(key, count + value);
                } else {
                    map.put(key, value);
                }
                line = br.readLine();
            }

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
