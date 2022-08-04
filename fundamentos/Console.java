package fundamentos;

import java.util.Scanner;

public class Console {
    private static Scanner entrada;

    public static void main(String[] args) {

        //  System.out.print("Gostosa");
       // System.out.print("dia!");

       // System.out.println("Bom");
      //  System.out.println("dia\n\n"); // quebrar linha
      //  System.out.printf("MegaSena: %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); //%n tbem quebra linha printf

     //   System.out.printf("salario : %.1f%n", 1234.5678);

      //  System.out.printf("Nome : %sn%", "joão");


      //  Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome");
        
        String nome = entrada.nextLine();

        System.out.println("Nome = " + nome);

    }
}