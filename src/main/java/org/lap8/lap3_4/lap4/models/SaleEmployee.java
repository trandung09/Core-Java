package org.lap8.lap3_4.lap4.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleEmployee extends Employee {

    private int sales;
    private double commissionRate;

    public SaleEmployee(String name, double salary, int sales, double commissionRate) {
        super(name, salary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "SaleEmployee{" +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                "sales=" + sales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
