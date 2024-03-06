package secao8.domain;

public class Student {
    private String name;
    private double notaFirst;
    private double notaSecond;
    private double notaThree;

    public Student(String name, double notaFirst, double notaSecond, double notaThree) {
        this.name = name;
        this.notaFirst = notaFirst;
        this.notaSecond = notaSecond;
        this.notaThree = notaThree;
    }

    public double resultNotas() {
        return notaFirst + notaSecond + notaThree;
    }

    public void pass() {
        System.out.printf("FINAL GRADE = %.2f%n", resultNotas());
        if (resultNotas() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", 60.0 - resultNotas());
        }
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotaFirst() {
        return notaFirst;
    }

    public void setNotaFirst(double notaFirst) {
        this.notaFirst = notaFirst;
    }

    public double getNotaSecond() {
        return notaSecond;
    }

    public void setNotaSecond(double notaSecond) {
        this.notaSecond = notaSecond;
    }

    public double getNotaThree() {
        return notaThree;
    }

    public void setNotaThree(double notaThree) {
        this.notaThree = notaThree;
    }
}
