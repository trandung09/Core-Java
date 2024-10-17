package org.lap6.bttl2.models;

public class BizStudent extends TechmasterStudent {

    private double marketing, sale;

    public BizStudent() {}

    public BizStudent(String name, String branch, double sale, double marketing) {
        super(name, branch);
        this.sale = sale;
        this.marketing = marketing;
    }

    @Override
    public double getScore() {
        return (marketing * 2 + sale) / 3;
    }

    public void printAllInfo() {
        super.printAllInfo();
        System.out.println("Marketing: " + marketing);
        System.out.println("Sale: " + sale);
    }
}
