package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {


        String s = " Bom dia L ";
        s = s.toUpperCase();// converter para Maisculo
        s = s.replace("L", "Senhora"); // troca por algo especifico da String tanto maiscula quanto minuscula
        s = s.concat("!!!"); // concatena no final

        System.out.println(s);

        String x = "gama".toUpperCase();
        System.out.println(x);
        System.out.println("Ingrid".toUpperCase());


        String y = "Bom dia X ".replace("X", "Ingrid");



        // não existe a conotação "." nos tipos primitivos

    }
}
