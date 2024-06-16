package model;

public class House extends Financing {

    public House(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        super(propertyValue, deadlineFinancing, annualTaxRate);
    }

    @Override
    double calculateMonthlyPayment() {
        double result;

        result = this.getPropertyValue() / (this.getDeadlineFinancing() * 12) * (1 + (this.getAnnualTaxRate() / 12)) + 80;

        return result;
    }
}
