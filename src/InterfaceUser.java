import java.util.Scanner;

public class InterfaceUser {
    double catchPropertyValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do imovél: ");

        return Double.parseDouble(scanner.nextLine());
    }

    int catchDeadlineFinancing() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Prazo do financiamento (em meses): ");

        return Integer.parseInt(scanner.nextLine());
    }

    public static void main(String [] args) {
        InterfaceUser userPrompt = new InterfaceUser();

        userPrompt.catchPropertyValue();
        userPrompt.catchDeadlineFinancing();
    }
}
