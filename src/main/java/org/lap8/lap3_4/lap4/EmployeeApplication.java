package org.lap8.lap3_4.lap4;

import org.lap8.lap3_4.lap4.models.AdministrativeEmployee;
import org.lap8.lap3_4.lap4.models.Employee;
import org.lap8.lap3_4.lap4.models.Role;
import org.lap8.lap3_4.lap4.services.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EmployeeApplication {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private final EmployeeService eService = EmployeeService.getInstance();
    private final EmployeeManager eManager = EmployeeManager.getInstance();

    private void menu() {
        System.out.println("1. Add Employee.");
        System.out.println("2. Delete Employee.");
        System.out.println("3. Print All Employee.");
        System.out.println("4. Find Employee By Salary.");
        System.out.println("5. Find Employee By Total Salary.");
        System.out.println("6. Sort Employee By Name And Total Salary.");
        System.out.println("7. Print 5 Employees With The Highest Total Salary.");
        System.out.println("0. Exit.");
    }

    public void application() throws IOException {

        String answer;
        do {
            menu();
            System.out.print("Enter your choice: ");
            answer = br.readLine();

            switch (answer) {
                case "1" -> {
                    System.out.print("Enter employee role: ");
                    String eRole = br.readLine();
                    switch (Role.valueOf(eRole.toUpperCase())) {
                        case ADMINISTRATIVE_STAFF -> {
                           AdministrativeEmployee e = eService.getAdministrativeEmployee(br);
                           eManager.addEmployee(e);
                        }
                        case DEPARTMENT_MANAGER -> eManager.addEmployee(eService.getDepartmentManager(br));
                        case SALE_STAFF -> eManager.addEmployee(eService.getSaleEmployee(br));
                    }
                }
                case "2" -> {
                    System.out.print("Enter employee id: ");
                    int eId = Integer.parseInt(br.readLine());
                    eManager.removeEmployee(eId);
                }
                case "3" -> eManager.printAllEmployees();
                case "4" -> {
                    System.out.print("Enter employee salary: ");
                    double eSalary = Double.parseDouble(br.readLine());
                    ArrayList<Employee> es = eManager.findEmployeeBySalary(eSalary);
                    if (es.isEmpty()) System.out.println("Not found.");
                    else {
                        for (Employee e : es) {
                            System.out.println(e);
                        }
                    }
                }
                case "5" -> {
                    System.out.print("Enter employee total salary: ");
                    double eSalary = Double.parseDouble(br.readLine());
                    ArrayList<Employee> es = eManager.findEmployeeByTotalSalary(eSalary);
                    if (es.isEmpty()) System.out.println("Not found.");
                    else {
                        for (Employee e : es) {
                            System.out.println(e);
                        }
                    }
                }
                case "6" -> eManager.sortEmployeeByNameAndTotalSalary();
                case "7" -> eManager.printFiveEmployeeWithHighestTotalSalary();
                case "0" -> {
                    return;
                }
                default -> System.out.println("Invalid input.");
            }
        } while (true);
    }

    public static void main(String[] args) throws IOException {

        new EmployeeApplication().application();
    }
}
