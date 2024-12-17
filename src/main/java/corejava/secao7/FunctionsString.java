package corejava.secao7;

public class FunctionsString {
    public static void main(String[] args) {
        String text = "Alison Diego José Maria";

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.trim());
        System.out.println(text.substring(2));
        System.out.println(text.substring(0,6));
        System.out.println(text.replace('a','x'));
        System.out.println(text.indexOf("li"));
    }
}
