package corejava.secao19.test;

import corejava.secao19.domain.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogEntryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter path file:");
        String path = scanner.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            Set<LogEntry> logEntries = new HashSet<>();

            while (line != null) {
                String[] lines = line.split(" ");
                String name = lines[0];
                Date moment = Date.from(Instant.parse(lines[1]));

                logEntries.add(new LogEntry(name, moment));
                line = br.readLine();
            }

            System.out.println("Total users: " + logEntries.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
