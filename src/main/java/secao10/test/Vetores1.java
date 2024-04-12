package secao10.test;

import java.util.Scanner;

public class Vetores1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {

            double[] valores = new double[n];
            valores[i] = scanner.nextDouble();

            sum += valores[i];
        }

        System.out.println(sum);
    }
}
