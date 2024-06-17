package secao18.test;

import secao18.domain.Contract;
import secao18.domain.Installment;
import secao18.service.ContractService;
import secao18.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContractTest {
    private static final Scanner scannerInt = new Scanner(System.in);
    private static final Scanner scannerDouble = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre os dados do contrato: ");
        System.out.println("Numero: ");
        Integer numero = scannerInt.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scannerInt.next(), dtf3);
        System.out.println("Valor do contrato: ");
        Double valor = scannerDouble.nextDouble();
        System.out.println("Entre com o numero de parcelas: ");
        Integer parcelas = scannerInt.nextInt();

        Contract contract = new Contract(numero, date, valor);
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
    }

}
