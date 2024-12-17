package corejava.secao10.test;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        // tipos primitivos não aceita valores null
        int x = 10;

        // boxing
        Object obj = x;

        System.out.println(obj);

        // unboxing
        int y = (int) obj;

        System.out.println(y);

        // classes wrappers exemplo: aceita valores null
        Double wrapper = null;
        System.out.println(wrapper);


    }
}
