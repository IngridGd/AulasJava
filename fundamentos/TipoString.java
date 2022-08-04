package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(2));

        String s = "Bom dia";

        System.out.println(s.concat("!!!")); // concatena
        System.out.println(s + "!!!"); // tbem concatena
        System.out.println(s.startsWith("boa"));
        System.out.println(s.startsWith("boa")); // verifica se é exatamente igual resposta em Boleon, inclui sendo maisculo ou n
        System.out.println(s.toLowerCase().startsWith("boa"));

        var nome = "ingrid";
        var idade = 26;
 // o %s em Java é o  mesmo que ${} em javascript
        System.out.printf(" a Senhorida  se chama %s tem %s anos " , nome , idade );

        // ver mais .contains // .indexOf // .substring


    }
}

