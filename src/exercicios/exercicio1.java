package exercicios;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        // Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
        // Leve em consideração o ano com 365 dias e o mês com 30.(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

        Scanner escanear = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int anos = escanear.nextInt();

        System.out.println("Quantos meses você tem?");
        int meses = escanear.nextInt();

        System.out.println("Quantos dias você tem?");
        int dias = escanear.nextInt();

        int resultado = anos*365+meses*30+dias;

        System.out.println("você tem " + resultado + " dias");

    }
}
