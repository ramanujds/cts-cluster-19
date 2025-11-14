package lambda;

// Functional Interface


interface Printable {
    void print();
}

interface Calc{
    int calculate(int a, int b);
}

interface CheckNum{
    boolean test(int number);
}


public class LambdaExample {

    public static void main(String[] args) {

        Calc add = (a, b) -> a+b;

        Calc subtract = (a,b) -> a-b;

        // Create lambda expression to test
        // 1 - check if a number is even
        // 2 - if a number is prime

    }
}
