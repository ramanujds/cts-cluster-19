package app;

import oop.EmployeeService;
import oop.EmployeeServiceImpl;
import model.Developer;
import model.Employee;
import model.Manager;

public class App {

    public static void main(String[] args) {

        EmployeeService service;

        service = new EmployeeServiceImpl();

        service.getAllEmployees();


        Employee employee2 = new Manager();

        Employee employee3 = new Developer();

    }

}
