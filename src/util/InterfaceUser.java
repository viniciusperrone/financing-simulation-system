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
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        double buildingArea = 0;

        while(!validEntry) {
            System.out.print("Digite o tamanho da área construída: ");

            if(scanner.hasNextDouble()) {
                try {
                    buildingArea = scanner.nextDouble();

                    if(buildingArea <= 0) {
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

        return buildingArea;
    }

    public double catchLandSize() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        double landSize = 0;

        while(!validEntry) {
            System.out.print("Digite o tamanho do terreno: ");

            if(scanner.hasNextDouble()) {
                try {
                    landSize = scanner.nextDouble();

                    if(landSize <= 0) {
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

        return landSize;
    }

    public int catchParkingSpaces() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        int parkingSpaces = 0;

        while(!validEntry) {
            System.out.print("Digite o número de vagas da garagem: ");

            if(scanner.hasNextInt()) {
                try {
                    parkingSpaces = scanner.nextInt();

                    if(parkingSpaces <= 0) {
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

        return parkingSpaces;
    }

    public int catchFloorNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        int floorNumber = 0;

        while(!validEntry) {
            System.out.print("Digite o número do andar: ");

            if(scanner.hasNextInt()) {
                try {
                    floorNumber = scanner.nextInt();

                    if(floorNumber <= 0) {
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

        return floorNumber;
    }

    public String catchKindOfZone() {
        Scanner scanner = new Scanner(System.in);
        boolean validEntry = false;
        String kindOfZone = "";

        while(!validEntry) {
            System.out.print("Digite o número do andar: ");

            if(scanner.hasNext()) {
                try {
                    kindOfZone = scanner.next();

                    if(kindOfZone.isEmpty()) {
                        throw new Exception("Valor inválido!");
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

        return kindOfZone;
    }

    public static void main(String [] args) {}
}
