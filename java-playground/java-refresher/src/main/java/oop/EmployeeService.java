package oop;

import model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee findEmployee(int id);

    List<Employee> getAllEmployees();

    void deleteEmployee(int id);

    Employee findByName(String name);


}
