package corejava.secao19.test;

import java.util.List;

public class CuringaTest1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printList(list);
    }

    public static void printList(List<?> list) {
        // list.add(2); não pode ser adicionado, pq ele não sabe qual o tipo q vai ser da minha lista
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
