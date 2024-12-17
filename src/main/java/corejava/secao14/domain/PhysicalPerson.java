package corejava.secao14.domain;

public class PhysicalPerson extends Person {
    private Double healthExpenses;

    public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public PhysicalPerson() {
        super();
    }

    @Override
    public Double calculateTax() {
        if (annualIncome < 2000.0 && healthExpenses > 0.0) {
            return (annualIncome * 15) / 100.0 - (healthExpenses * 50) / 100.0;

        } else if (annualIncome > 2000.0 && healthExpenses > 0.0) {
            return (annualIncome * 25) / 100.0 - (healthExpenses * 50) / 100.0;

        } else if (annualIncome < 2000.0) {
            return (annualIncome * 15) / 100.0;
        } else {
            return (annualIncome * 25) / 100.0;
        }

    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }
}
