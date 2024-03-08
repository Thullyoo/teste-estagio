import java.util.Scanner;


public class Number2 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numeroentrada = teclado.nextInt();

    int a = 0;
    int b = 1;
    int valoratual = a + b;

    if (numeroentrada == a || numeroentrada == b){
        System.out.println("O valor : " + numeroentrada + " está na sequência Fibonnaci");
        return;
    }



    while (numeroentrada >= valoratual){
        if(numeroentrada == valoratual){
            System.out.println("O valor : " + numeroentrada + " está na sequência Fibonnaci");
            return;
        }

        valoratual = a + b;
        b = a;
        a = valoratual;

    }
        System.out.println("O valor : " + numeroentrada + " não está na sequência Fibonnaci");
    return;
    }

    }
