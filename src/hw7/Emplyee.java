package hw7;

public class Emplyee {

    private double baseSalary;
    private String name;
    private  double salary;

    public Emplyee(double baseSalary, String name, double salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

}
