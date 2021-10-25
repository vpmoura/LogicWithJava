import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double productValue = keyboard.nextDouble();

        System.out.print("Digite quantidade passada pelo cliente: ");
        Double clientValue = keyboard.nextDouble();

        Double result = clientValue - productValue;

        System.out.println("Troco: " + result);

        keyboard.close();
    }
}
