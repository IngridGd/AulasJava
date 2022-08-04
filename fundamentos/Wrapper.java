package fundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(entrada.next()); // int
        Long l = 100000L;


        System.out.println(b.byteValue()); // mostrar o valor que ta dentro do b
        System.out.println(s.toString()); // moostrar valor porem em string

        System.out.println(i *3);

        System.out.println(i / 3);

        entrada.close();


        Float f = 135.10F;
        System.out.println(f);

        Double d = 1234.5960;
        System.out.println(d);

        // convertendo Boolean

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        System.out.println("" + bo.toString().toUpperCase());

        Character c = '#'; //char

        System.out.println( c + "...");

    }
}
