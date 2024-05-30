package util;

import java.util.Scanner;

public class InterfaceUser {
    public double catchPropertyValue() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        double propertyValue = 0;

        while(!validEntry) {
            System.out.print("Digite o valor do imovél: ");

            if(scanner.hasNextDouble()) {
                propertyValue = scanner.nextDouble();

                if(propertyValue <= 0) {
                    System.out.println("Valor deve ser positivo!");
                } else {
                    validEntry = true;
                }
            }

            else {
                System.out.println("Valor inválido!");

                scanner.next();
            }
        }

        return propertyValue;
    }

    public int catchDeadlineFinancing() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        int deadlineFinancing = 0;

        while(!validEntry) {
            System.out.print("Digite o prazo do financiamento (em meses): ");

            if(scanner.hasNextInt()) {
                deadlineFinancing = scanner.nextInt();

                if(deadlineFinancing <= 0) {
                    System.out.println("Valor deve ser positivo!");
                } else {
                    validEntry = true;
                }

            }

            else {
                System.out.println("Valor inválido!");

                scanner.next();
            }
        }

        return deadlineFinancing;
    }

    public double catchAnnualTaxRate() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        double annualTaxRate = 0;

        while(!validEntry) {
            System.out.print("Digite a taxa de juros: ");

            if(scanner.hasNextDouble()) {
                annualTaxRate = scanner.nextDouble();

                if(annualTaxRate <= 0) {
                    System.out.println("Valor deve ser positivo!");
                }
                if(annualTaxRate >= 100000000) {
                    System.out.println("Taxa muito alta!");
                }
                else {
                    validEntry = true;
                }
            }

            else {
                System.out.println("Valor inválido!");

                scanner.next();
            }
        }

        return annualTaxRate;
    }

    public static void main(String [] args) {}
}
