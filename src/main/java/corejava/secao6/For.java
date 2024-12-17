package corejava.secao6;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        print();

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        print();

        for (int i = 99; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        print();

        for (int i = 0; i < 20; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void print() {
        System.out.println("----------");
    }
}
