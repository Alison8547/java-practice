package corejava.secao15.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTraceTest {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("START METHOD 1");
        method2();
        System.out.println("END METHOD 1");
    }

    public static void method2() {
        System.out.println("START METHOD 2");
        try {
            Scanner sc = new Scanner(System.in);
            String[] names = sc.nextLine().split(" ");
            int i = sc.nextInt();
            System.out.println(names[i]);

        } catch (InputMismatchException e) {
            System.err.println("Imput error!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Position not found!");
            e.printStackTrace();
        }

        System.out.println("End of program");
        System.out.println("END METHOD 2");
    }
}
