/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.List;

/**
 *
 * @author student
 */
public class Main {

    public static void main(String[] args) {
        // Add employees
        EmployeeDAO.addEmployee("Alice Cooper", "Developer", 70000);
        EmployeeDAO.addEmployee("Bob Marley", "Manager", 80000);
        // Update employee
//        EmployeeDAO.updateEmployee(1, "John Doe", "Senior Software Engineer",
//                90000);
//        // Get all employees
//        List<Employee> employees = EmployeeDAO.getAllEmployees();
//        employees.forEach(System.out::println);
//        // Delete employee
//        EmployeeDAO.deleteEmployee(2);
    }

}
