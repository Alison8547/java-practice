package corejava.secao18.service;

import corejava.secao18.domain.Contract;
import corejava.secao18.domain.Installment;

import java.util.ArrayList;
import java.util.List;

public class ContractService {
    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        List<Installment> installmentList = new ArrayList<>();
        Double parcelaNoTax = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            Double interest = onlinePaymentService.interest(parcelaNoTax, i);
            Double paymentFee = onlinePaymentService.paymentFee(parcelaNoTax + interest);
            Double quota = parcelaNoTax + interest + paymentFee;

            installmentList.add(new Installment(contract.getDate().plusMonths(i), quota));
        }

        contract.setInstallments(installmentList);
    }
}
