package secao10.test;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Jose");
        lista.add("Ana");

        System.out.println(lista);
        lista.add(1, "Alison");

        System.out.println(lista);
        lista.remove(2);

        System.out.println(lista);
        lista.removeIf(x -> x.charAt(0) == 'M');

        System.out.println(lista);

        System.out.println(lista.indexOf("Alison"));
        System.out.println(lista.indexOf("Goku")); // -1 quando não existe

        List<String> results = lista.stream().filter(x -> x.charAt(0) == 'A').toList();

        System.out.println(results);

        String filter = results.stream().findFirst().filter(x -> x.charAt(0) == 'Z').orElse(null);
        System.out.println(filter);

    }
}
