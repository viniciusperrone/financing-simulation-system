package model;

public abstract class Financing {
    public final double propertyValue;
    public final int deadlineFinancing;
    public final double annualTaxRate;

    public Financing(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        this.propertyValue = propertyValue;
        this.deadlineFinancing = deadlineFinancing;
        this.annualTaxRate = annualTaxRate;
    }

    public double getPropertyValue() {
        return this.propertyValue;
    }

    public int getDeadlineFinancing() {
        return this.deadlineFinancing;
    }

    public double getAnnualTaxRate() {
        return this.annualTaxRate;
    }

    public abstract double calculateMonthlyPayment();

    public abstract double calculateTotalPayment();

    public static void main(String [] args) {}
}
