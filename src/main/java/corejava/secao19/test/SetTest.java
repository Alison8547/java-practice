package corejava.secao19.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // mais rapido porem não são ordernados e elementos unicos

        set.add("Beatriz");
        set.add("Julio");
        set.add("Alison");
        set.add("Mario");

        Set<String> set2 = new TreeSet<>(set); // os dados são ordenados e mais lento que o HashSet

        System.out.println(set2);

        Set<String> set3 = new LinkedHashSet<>(); // é derivada de HashSet, mas mantém uma lista duplamente ligada através de seus itens. Seus elementos são iterados na ordem em que foram inseridos.
        set3.add("Beatriz");
        set3.add("Julio");
        set3.add("Alison");
        set3.add("Mario");
        System.out.println(set3);

        System.out.println(set.contains("Alison"));
        System.out.println();

        set.removeIf(s -> s.equals("Julio"));

        for (String s : set) {
            System.out.println(s);
        }

    }
}
