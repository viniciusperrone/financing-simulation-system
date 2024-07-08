//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package main;

import model.Financing;
import model.Apartment;
import model.House;
import model.Land;

import util.InterfaceUser;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("------------Finaciamento Imobiliário------------\n");

        int option = 0;
        double totalSumPropertyValue = 0;
        double totalSumPaymentByFinancing = 0;

        List<Financing> financings = new ArrayList<Financing>();

        FileWriter write = null;

        try {
            write = new FileWriter("financings.txt");

            while(option != 4) {
                System.out.println("1. Casa");
                System.out.println("2. Apartamento");
                System.out.println("3. Terreno");
                System.out.println("4. Sair");

                InterfaceUser userPrompt = new InterfaceUser();

                System.out.print("Digite sua opção: ");

                option = userPrompt.catchOptionMenu();

                switch (option) {
                    case 1:
                        double propertyValueHouse = userPrompt.catchPropertyValue();
                        int deadlineFinancingHouse = userPrompt.catchDeadlineFinancing();
                        double annualTaxRateHouse = userPrompt.catchAnnualTaxRate();

                        House house = new House(propertyValueHouse, deadlineFinancingHouse, annualTaxRateHouse);

                        house.setLandSize(
                                userPrompt.catchLandSize()
                        );

                        house.setBuildingArea(
                                userPrompt.catchBuildingArea()
                        );

                        totalSumPropertyValue += house.getPropertyValue();
                        totalSumPaymentByFinancing += house.calculateTotalPayment();

                        write.write(house.toString() + "\n");

                        financings.add(house);

                        break;

                    case 2:
                        double propertyValueApartment = userPrompt.catchPropertyValue();
                        int deadlineFinancingApartment = userPrompt.catchDeadlineFinancing();
                        double annualTaxRateApartment = userPrompt.catchAnnualTaxRate();

                        Apartment apartment = new Apartment(propertyValueApartment, deadlineFinancingApartment, annualTaxRateApartment);

                        apartment.setParkingSpaces(
                                userPrompt.catchParkingSpaces()
                        );

                        apartment.setFloorNumber(
                                userPrompt.catchFloorNumber()
                        );

                        totalSumPropertyValue += apartment.getPropertyValue();
                        totalSumPaymentByFinancing += apartment.calculateTotalPayment();

                        financings.add(apartment);

                        write.write(apartment.toString() + "\n");

                        break;

                    case 3:
                        double propertyValueLand = userPrompt.catchPropertyValue();
                        int deadlineFinancingLand = userPrompt.catchDeadlineFinancing();
                        double annualTaxRateLand = userPrompt.catchAnnualTaxRate();

                        Land land = new Land(propertyValueLand, deadlineFinancingLand, annualTaxRateLand);

                        land.setKindOfZone(
                                userPrompt.catchKindOfZone()
                        );

                        totalSumPropertyValue += land.getPropertyValue();
                        totalSumPaymentByFinancing += land.calculateTotalPayment();

                        write.write(land.toString() + "\n");

                        financings.add(land);

                        break;
                    default:
                        break;
                }
            }

            write.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("\n------------Resultado------------\n");

        System.out.println("Total de todos os imóveis: R$" + totalSumPropertyValue);
        System.out.println("Total de todos os financiamentos: R$" + totalSumPaymentByFinancing);
    }
}