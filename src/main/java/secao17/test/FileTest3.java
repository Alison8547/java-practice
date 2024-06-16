package secao17.test;

import java.io.File;
import java.util.Scanner;

public class FileTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String path = sc.nextLine();

        File folder = new File(path);

        File[] files = folder.listFiles(File::isFile);

        for (File file : files) {
            System.out.println(file.getName());
        }
        System.out.println();

        for (File file : files) {
            System.out.println(file.getPath());
        }
    }
}
