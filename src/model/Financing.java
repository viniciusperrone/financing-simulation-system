package model;

public class Financing {
    private double propertyValue;
    private int deadlineFinancing;
    private double annualTaxRate;

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

    double calculateMonthlyPayment() {
        double result;

        result = this.propertyValue / (this.deadlineFinancing * 12) * (1 + (this.annualTaxRate / 12));

        return result;
    }

    double calculateTotalPayment() {
        double result;
        double monthlyPayment = this.calculateMonthlyPayment();

        result = monthlyPayment * this.deadlineFinancing * 12;

        return result;
    }

    public void printData() {
        System.out.println("Valor do imovél: " + this.propertyValue);
        System.out.println("Prazo em meses: " + this.deadlineFinancing);
        System.out.println("Taxa de imposto anual: " + this.annualTaxRate);
    }

    public static void main(String [] args) {}
}
