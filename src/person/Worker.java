package person;

public class Worker extends Person{

    private int salary;

    public Worker() {

    }

    public Worker(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
