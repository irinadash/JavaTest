import person.Worker;

public class main {

    public static void main(String[] args) {

        Worker worker = new Worker("Sergey", 30, 'M', 1000);
        worker.setSalary(1000);
        worker.setName("Sergey");
        worker.setAge(30);

        Worker.VERSION = 20;
        System.out.println(worker.getName());
    }
};
