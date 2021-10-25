import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o valor do número: ");
        Double number = keyboard.nextDouble();

        Double square = number * number;
        System.out.println("O quadrado do número digitado é: " + square);

        keyboard.close();
    }
}
