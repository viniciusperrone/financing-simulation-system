package model;

public class Land extends Financing {
    private String kindOfZone;

    public Land(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        super(propertyValue, deadlineFinancing, annualTaxRate);

    }

    @Override
    public double calculateMonthlyPayment() {
        double result;
        double additionalTax = super.getPropertyValue() * 0.02;

        result = additionalTax + this.getPropertyValue() / (this.getDeadlineFinancing() * 12) * (1 + (this.getAnnualTaxRate() / 12));

        return result;
    }

    @Override
    public double calculateTotalPayment() {
        double result;
        double monthlyPayment = this.calculateMonthlyPayment();

        result = monthlyPayment * this.deadlineFinancing * 12;

        return result;
    }

    public String getKindOfZone() {
        return kindOfZone;
    }

    public void setKindOfZone(String kindOfZone) {
        this.kindOfZone = kindOfZone;
    }
}
