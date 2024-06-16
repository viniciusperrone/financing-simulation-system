package model;

import java.lang.Math;

public class Apartment extends  Financing{
    private double monthlyTax;

    public Apartment(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        super(propertyValue, deadlineFinancing, annualTaxRate);
    }

    public void calculateMonthlyTax() {
        this.monthlyTax = this.getAnnualTaxRate() / 12;
    }

    public double getMonthlyTax() {
        return this.monthlyTax;
    }

    @Override
    public double calculateTotalPayment() {
        double result;
        int totalMonths = super.getDeadlineFinancing() * 12;

        this.calculateMonthlyTax();

        result = (super.getPropertyValue() * Math.pow(1 +  this.getMonthlyTax(), totalMonths)) / Math.pow(1 + this.getMonthlyTax(), totalMonths - 1);

        return result;
    }
}
