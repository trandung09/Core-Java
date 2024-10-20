package org.lap8.lap3_4.lap4;

import lombok.Getter;
import org.lap8.lap3_4.lap4.models.Employee;
import org.lap8.lap3_4.lap4.services.EmployeeService;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class EmployeeManager {

    private final List<Employee> employees = new ArrayList<Employee>();

    private EmployeeManager() {
    }

    public ArrayList<Employee> findEmployeeBySalary(double salary) {
        return (ArrayList<Employee>) employees.stream()
                .filter(o -> o.getSalary() == salary)
                .collect(Collectors.toList());
    }

    public ArrayList<Employee> findEmployeeByTotalSalary(double salary) {
        EmployeeService eService = EmployeeService.getInstance();
        return (ArrayList<Employee>) employees.stream()
                .filter(o -> eService.getSalaryOfEmployee(o) == salary)
                .collect(Collectors.toList());
    }

    public void sortEmployeeByNameAndTotalSalary() {
        EmployeeService eService = EmployeeService.getInstance();
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (eService.getSalaryOfEmployee(o1) < eService.getSalaryOfEmployee(o2)) return 1;
                else if (eService.getSalaryOfEmployee(o1) > eService.getSalaryOfEmployee(o2)) return -1;
                else {
                    return Integer.compare(o1.getName().compareTo(o2.getName()), 0);
                }
            }
        });
    }

    public void addEmployee(Employee employee) {
        if (employee == null) return;
        employees.add(employee);
    }

    public void removeEmployee(int id) {
        employees.removeIf(o -> o.getId() == id);
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void printFiveEmployeeWithHighestTotalSalary() {
        sortEmployeeByNameAndTotalSalary();
        for (int i = 0; i < 5; i++) {
            System.out.println(employees.get(i));
        }
    }

    public static EmployeeManager getInstance() {
        return EmployeeManagerHolder.INSTANCE;
    }

    private static class EmployeeManagerHolder {
        private static final EmployeeManager INSTANCE = new EmployeeManager();
    }
}
