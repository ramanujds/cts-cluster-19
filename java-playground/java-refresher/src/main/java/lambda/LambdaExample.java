package lambda;

interface Printable {
    void print();
}


public class LambdaExample {

    public static void main(String[] args) {
        Printable p = () -> {
            System.out.println("Hello");
        };

        p.print();
    }
}
