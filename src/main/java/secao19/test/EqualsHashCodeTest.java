package secao19.test;

import secao19.domain.Client;

public class EqualsHashCodeTest {
    public static void main(String[] args) {
        Client c1 = new Client("Alison", "alison@gmail.com");
        Client c2 = new Client("Alison", "alison@gmail.com");
        Client c3 = new Client("Marcio", "marcio@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        System.out.println(c1 == c2);

        String s1 = "Alison";
        String s2 = "Alison";

        System.out.println(s1 == s2);

        String s3 = new String("Alison");
        String s4 = new String("Alison");

        System.out.println(s3 == s4);
    }
}
