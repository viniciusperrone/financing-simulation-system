package model;

import java.lang.Math;

public class Apartment extends Financing{
    private double monthlyTax;
    private int parkingSpaces;
    private int floorNumber;

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
    public double calculateMonthlyPayment() {
        double result;

        result = this.propertyValue / (this.deadlineFinancing * 12) * (1 + (this.annualTaxRate / 12));

        return result;
    }

    @Override
    public double calculateTotalPayment() {
        double result;
        int totalMonths = super.getDeadlineFinancing() * 12;

        this.calculateMonthlyTax();

        result = (super.getPropertyValue() * Math.pow(1 +  this.getMonthlyTax(), totalMonths)) / Math.pow(1 + this.getMonthlyTax(), totalMonths - 1);

        return result;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Apartamento - " + "valor imovél: " + this.propertyValue + ", prazo (meses): " + this.deadlineFinancing +
                ", taxa anual: " + this.annualTaxRate + ", taxa mensal: " + this.calculateMonthlyPayment() +
                ", vagas garagem: " + this.parkingSpaces + ", número andar: " + this.floorNumber;
    }
}
