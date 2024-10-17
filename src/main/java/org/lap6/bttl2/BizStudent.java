package org.lap6.bttl2;

public class BizStudent extends TechmasterStudent {

    private double marketing, sale;

    public BizStudent() {}

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
