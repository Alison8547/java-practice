package secao13.domain;

import secao13.enums.WokerLever;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WokerLever level;
    private Double baseSalary;
    private Derpatment derpatment;
    private List<HourContract> contractList = new ArrayList<>();

    public Worker(String name, WokerLever level, Double baseSalary, Derpatment derpatment) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.derpatment = derpatment;

    }

    public Worker() {
    }

    public void addContract(HourContract contract) {
        contractList.add(contract);
    }

    public void remove(HourContract contract) {
        contractList.remove(contract);
    }

    public Double income(Integer year, Integer month) {

        double income = 0;

        List<HourContract> list = contractList.stream()
                .filter(x -> x.getDate().getMonth() == Month.of(month) && x.getDate().getYear() == year)
                .toList();

        for (HourContract contract : list) {
            income += contract.totalValue();
        }
        income += baseSalary;
        return income;
    }


    public WokerLever getLevel() {
        return level;
    }

    public void setLevel(WokerLever level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Derpatment getDerpatment() {
        return derpatment;
    }

    public void setDerpatment(Derpatment derpatment) {
        this.derpatment = derpatment;
    }

    public List<HourContract> getContractList() {
        return contractList;
    }

    public void setContractList(List<HourContract> contractList) {
        this.contractList = contractList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
