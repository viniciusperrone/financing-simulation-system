import java.util.Scanner;

public class InterfaceUser {
    double catchPropertyValue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do imovél: ");

        return Double.parseDouble(scanner.nextLine());
    }

    public static void main(String [] args) {
        InterfaceUser userPrompt = new InterfaceUser();

        userPrompt.catchPropertyValue();
    }
}
