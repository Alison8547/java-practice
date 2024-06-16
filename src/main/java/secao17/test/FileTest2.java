package secao17.test;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class FileTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String path = sc.nextLine();

        File folder = new File(path);

        File[] folders = folder.listFiles(File::isDirectory);

        System.out.println("FOLDERS");
        for (File f : Objects.requireNonNull(folders)) {
            System.out.println(f.getName());
        }
        System.out.println();

        File[] files = folder.listFiles(File::isFile);
        System.out.println("FILES");
        for (File f : Objects.requireNonNull(files)) {
            System.out.println(f.getName());
        }
        System.out.println();

        boolean sucess = new File(path, "\\subdir").mkdir();

        System.out.println("Directory created successfully: " + sucess);
    }
}
