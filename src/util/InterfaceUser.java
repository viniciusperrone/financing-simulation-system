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
                try {
                    propertyValue = scanner.nextDouble();

                    if(propertyValue <= 0) {
                        throw new Exception("Valor deve ser positivo!");
                    } else {
                        validEntry = true;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
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
                try {
                    deadlineFinancing = scanner.nextInt();

                    if(deadlineFinancing <= 0) {
                        throw new Exception("Valor deve ser positivo!");
                    } else {
                        validEntry = true;
                    }

                } catch(Exception e) {
                    System.out.println(e.getMessage());
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
                try {
                    annualTaxRate = scanner.nextDouble();

                    if(annualTaxRate <= 0) {
                        throw new Exception("Valor deve ser positivo!");
                    }
                    if(annualTaxRate >= 100000000) {
                        throw new Exception("Taxa muito alta!");
                    }
                    else {
                        validEntry = true;
                    }
                } catch(Exception e) {}


            }

            else {
                System.out.println("Valor inválido!");

                scanner.next();
            }
        }

        return annualTaxRate;
    }

    public double catchBuildingArea() {
        return 0;
    }

    public double catchLandSize() {
        return 0;
    }

    public double catchMonthlyTax() {
        return 0;
    }

    public int catchParkingSpaces() {
        return 0;
    }

    public int catchFloorNumber() {
        return 0;
    }

    public String catchKindOfZone() {
        return new String("a");
    }

    public static void main(String [] args) {}
}
