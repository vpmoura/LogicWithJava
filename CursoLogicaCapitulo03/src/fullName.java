import java.util.Scanner;

public class fullName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = keyboard.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String lastName = keyboard.nextLine();

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        keyboard.close();
    }
}
