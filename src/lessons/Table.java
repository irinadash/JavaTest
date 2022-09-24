package lessons;

public class Table {

    static String line = "\t____________________________________________________________________________\n";
    static String vLine = "\t|\t";
    static String endLine = "\t|";
    static String tab = "\t";

    public static void printLine(){
        System.out.println("\t__________________________________________________________________________\n");
    }

    public static void print(String l){
        System.out.println(l);
    }


    public static void main(String[] args) {
        String hi = "Hello!";
        printLine();
        print(line);
        print("Task #");
        print(hi);
    }
}
