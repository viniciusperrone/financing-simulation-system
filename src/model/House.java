package model;

public class House extends Financing {
    private double buildingArea;
    private double landSize;

    public House(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        super(propertyValue, deadlineFinancing, annualTaxRate);
    }

    public double getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(double buildingArea) {
        this.buildingArea = buildingArea;
    }

    public double getLandSize() {
        return this.landSize;
    }

    public void setLandSize(double landSize) {
        this.landSize = landSize;
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

    @Override
    public String toString() {
        return "Casa - " + "valor imovél: " + this.propertyValue + ", prazo (meses): " + this.deadlineFinancing +
                ", taxa anual: " + this.annualTaxRate + ", tamanho terreno: " + this.landSize +
                ", tamanho area construída: " + this.buildingArea;
    }

}
