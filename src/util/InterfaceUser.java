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

                validEntry = true;
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

                validEntry = true;
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

        System.out.print("Digite a taxa de juros: ");

        return Double.parseDouble(scanner.nextLine());
    }

    public static void main(String [] args) {}
}
