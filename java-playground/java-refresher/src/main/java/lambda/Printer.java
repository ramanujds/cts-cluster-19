package lambda;

public class Printer implements Printable{
    public void print() {
        System.out.println("Hey there..");
    }

    public void scan(){

    }

    public static void main(String[] args) {
        var p = new Printer();
        p.print();
    }
}
