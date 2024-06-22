package secao19.test;

import secao19.service.PrintService;

import java.util.Scanner;

public class GenericsTest {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();


        System.out.println("How many values? ");
        int n = scInt.nextInt();

        for (int i = 0; i < n; i++) {
            printService.addValue(scInt.nextInt());
        }

        printService.print();
        System.out.println(printService.first());
    }
}
