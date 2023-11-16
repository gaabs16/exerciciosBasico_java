package exercicios;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        // Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        // antecessor e seu sucessor.

        Scanner escanear = new Scanner(System.in);

        int valor = 0;

        System.out.println("digite um numero inteiro");
        valor = escanear.nextInt();

        int numero1 = valor+1;
        int numero2 = valor-1;
        System.out.println("o valor inicial " + valor);
        System.out.println("o sucessor " + numero1);
        System.out.println("o antecessor " + numero2);
    }
}
