package secao14.domain;

public class LegalPerson extends Person {
    private Integer numberEmployees;

    public LegalPerson(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public LegalPerson() {
        super();
    }


    @Override
    public Double calculateTax() {
        if (numberEmployees > 10) {
            return (annualIncome * 14) / 100.0;
        }else {
            return (annualIncome * 16) / 100.0;
        }
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
}
