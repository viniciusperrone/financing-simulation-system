public class Financing {
    double propertyValue;
    int deadlineFinancing;
    double annualTaxRate;

    public Financing(double propertyValue, int deadlineFinancing, double annualTaxRate) {
        this.propertyValue = propertyValue;
        this.deadlineFinancing = deadlineFinancing;
        this.annualTaxRate = annualTaxRate;
    }

    double calculateMonthlyPayment() {
        double result;

        result = this.propertyValue / (this.deadlineFinancing * 12) * (1 + (this.annualTaxRate / 12));

        return result;
    }

    public static void main(String [] args) {}
}
