//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;

import model.Financing;
import util.InterfaceUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------Finaciamento Imobiliário------------\n");

        InterfaceUser userPrompt = new InterfaceUser();

        double propertyValue = userPrompt.catchPropertyValue();
        int deadlineFinancing = userPrompt.catchDeadlineFinancing();
        double annualTaxRate = userPrompt.catchAnnualTaxRate();

        Financing financing = new Financing(propertyValue, deadlineFinancing, annualTaxRate);
    }
}