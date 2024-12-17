package corejava.secao19.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(List.of(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(List.of(5, 6, 7, 8, 9, 10));


        // union (junta as duas listas)
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // intersection (os elementos que tem nos dois conjuntos)
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // difference (elementos da lista a que não tem na lista b)
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
