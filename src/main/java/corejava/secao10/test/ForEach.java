package corejava.secao10.test;

public class ForEach {
    public static void main(String[] args) {
        String[] nomes = new String[]{"Alison", "Diego", "Maria"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
