package exercicios;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // Informar um saldo e imprimir o saldo com reajuste de 1%.

        Scanner escanear = new Scanner(System.in);
        System.out.println("por favor, informe um saldo");
        Float saldo = escanear.nextFloat();

        saldo+=(saldo/100); // soma com atribuição
        System.out.println("seu saldo é " + saldo);

    }
}
