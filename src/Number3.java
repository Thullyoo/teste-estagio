import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        char[] fraseRepartida = frase.toCharArray();
        Integer i = 0;
        String fraseRevertida = "";
        Integer indiceFinal = fraseRepartida.length - 1;

        while (fraseRepartida.length > i) {
            fraseRevertida += fraseRepartida[indiceFinal];
            indiceFinal--;
            i++;
        }
        System.out.println(fraseRevertida);
    }
    }



