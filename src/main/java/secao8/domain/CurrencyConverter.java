package secao8.domain;

public class CurrencyConverter {
    public static double converter(double precoDolar, double payment) {
        double dolar = payment * precoDolar;
        dolar += dolar * 6 / 100;
        return dolar;
    }
}
