package model;

public class House extends Financing {

    public House(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        super(propertyValue, deadlineFinancing, annualTaxRate);
    }

    @Override
    public double calculateMonthlyPayment() {
        double result;

        result = this.getPropertyValue() / (this.getDeadlineFinancing() * 12) * (1 + (this.getAnnualTaxRate() / 12)) + 80;

        return result;
    }

    @Override
    public double calculateTotalPayment() {
        double result;

        double monthlyPayment = this.calculateMonthlyPayment();

        result = monthlyPayment * this.deadlineFinancing * 12;

        return result;
    }

}
