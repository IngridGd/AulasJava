package fundamentos;

import java.util.Scanner;

public class TestesnextInt {
    public static <string> void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        System.out.println("Qual o seu nome?");
        string nome = (string) teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        string sobrenome = (string) teclado.nextLine();

        teclado.close();
    }
}
