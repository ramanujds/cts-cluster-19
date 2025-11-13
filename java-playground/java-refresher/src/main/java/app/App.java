package app;

import model.Developer;
import model.Employee;

public class App {

    public static void main(String[] args) {

        Employee e1 = new Employee(101,"Harsh",56000);
        Employee e2 = new Developer(102,"Javed",78000,"Java");

        e1.printDetails();

        e2.printDetails();

    }

}
