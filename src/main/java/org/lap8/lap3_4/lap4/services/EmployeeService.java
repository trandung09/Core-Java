package org.lap8.lap3_4.lap4.services;

import org.lap8.lap3_4.lap4.models.AdministrativeEmployee;
import org.lap8.lap3_4.lap4.models.DepartmentManager;
import org.lap8.lap3_4.lap4.models.Employee;
import org.lap8.lap3_4.lap4.models.SaleEmployee;

import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeService {

    private EmployeeService() {
    }

    public AdministrativeEmployee getAdministrativeEmployee(BufferedReader br) throws IOException {

        System.out.print("Enter administrative employee name: ");
        String name = br.readLine();
        System.out.print("Enter administrative employee salary: ");
        double salary = Double.parseDouble(br.readLine());

        return new AdministrativeEmployee(name, salary);
    }

    public DepartmentManager getDepartmentManager(BufferedReader br) throws IOException {
        System.out.print("Enter department manager name: ");
        String name = br.readLine();
        System.out.print("Enter department manager salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Enter department manager other salary: ");
        double oSalary = Double.parseDouble(br.readLine());

        return new DepartmentManager(name, salary, oSalary);
    }

    public SaleEmployee getSaleEmployee(BufferedReader br) throws IOException {
        System.out.print("Enter sale employee name: ");
        String name = br.readLine();
        System.out.print("Enter sale employee salary: ");
        double salary = Double.parseDouble(br.readLine());
        System.out.print("Enter sale employee sales: ");
        int sales = Integer.parseInt(br.readLine());
        System.out.print("Enter sale employee commission rate: ");
        double commissionRate = Double.parseDouble(br.readLine());

        return new SaleEmployee(name, salary, sales, commissionRate);
    }

    public double getSalaryOfEmployee(Employee employee) {
        if (employee instanceof AdministrativeEmployee) {
            return employee.getSalary();
        }
        if (employee instanceof DepartmentManager manager) {
            return manager.getSalary() +  manager.getOtherSalary();
        }
        if (employee instanceof SaleEmployee saleEmployee) {
            return saleEmployee.getSalary() + saleEmployee.getSales() * saleEmployee.getCommissionRate();
        }
        return 0;
    }

    public static EmployeeService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final EmployeeService INSTANCE = new EmployeeService();
    }
}
