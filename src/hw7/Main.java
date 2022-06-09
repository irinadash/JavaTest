package hw7;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(1000, "David");
        Manager manager = new Manager(1000, "Kristen", 80);
        Manager manager2 = new Manager(3000, "Dia", 80);
        Manager manager3 = new Manager(5000, "Rob", 80);
        Manager manager4 = new Manager(10000, "Carol", 80);
        System.out.println(manager.getSalary());
    }
}
