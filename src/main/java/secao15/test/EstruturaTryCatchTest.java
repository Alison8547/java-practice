package secao15.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatchTest {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            String[] names = sc.nextLine().split(" ");
            int i = sc.nextInt();
            System.out.println(names[i]);

        } catch (InputMismatchException e) {
            System.err.println("Imput error!");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Position not found!");
        }

        System.out.println("End of program");

    }
}
