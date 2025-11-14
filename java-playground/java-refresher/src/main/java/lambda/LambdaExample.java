package lambda;

// Functional Interface


interface Printable {
    void print();
    default void scan(){
        System.out.println("Default scan");
    }

    static void fun(){

    }
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

        CheckNum isEven = number -> number%2==0;

        CheckNum isPrime = number -> {
            for (int i=2; i<= number/2; i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(isEven.test(10));
        System.out.println(isPrime.test(13));

        // 2 - if a number is prime

    }
}
