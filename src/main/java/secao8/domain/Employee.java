package secao8.domain;

public class Employee {
    private String name;
    private Double salary;
    private Double tax;

    public Employee(String name, Double salary, Double tax) {
        this.name = name;
        this.salary = salary;
        this.tax = tax;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + netSalary() +
                '}';
    }

    public double netSalary() {
        return salary - tax;
    }

    public void increaseSalary(double porcentage) {
        salary += (salary * porcentage) / 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
