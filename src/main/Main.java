//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;

import model.Financing;
import model.Apartment;

import util.InterfaceUser;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Finaciamento Imobiliário------------\n");

        int countLoop = 0;
        double totalSumPropertyValue = 0;
        double totalSumPaymentByFinancing = 0;

        List<Financing> financings = new ArrayList<Financing>();

        while(countLoop < 4) {
            InterfaceUser userPrompt = new InterfaceUser();

            double propertyValue = userPrompt.catchPropertyValue();
            int deadlineFinancing = userPrompt.catchDeadlineFinancing();
            double annualTaxRate = userPrompt.catchAnnualTaxRate();

            Financing financing = new Apartment(propertyValue, deadlineFinancing, annualTaxRate);

            System.out.print("\n");

            totalSumPropertyValue += financing.getPropertyValue();
            totalSumPaymentByFinancing += financing.calculateTotalPayment();

            financings.add(financing);

            countLoop += 1;
        }

        System.out.println("------------Resultado------------\n");

        System.out.println("Total de todos os imóveis: R$" + totalSumPropertyValue);
        System.out.println("Total de todos os financiamentos: R$" + totalSumPaymentByFinancing);
    }
}