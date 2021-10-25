import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Digite o valor do seu peso: ");
        Double weight = keyboard.nextDouble();

        System.out.print("Digite o valor da sua altura: ");
        Double height = keyboard.nextDouble();

        Double imc = weight  / (height * height);
        System.out.println("O valor do seu IMC: " + imc);

        keyboard.close();
    }
}
