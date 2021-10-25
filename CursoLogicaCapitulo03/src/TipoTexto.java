import java.util.Scanner;

public class TipoTexto {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.nextLine();
        System.out.println("Olá " + name + "!");

        Character variavelChar = 'A';

        keyboard.close();
    }
}
