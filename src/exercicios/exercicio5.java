package exercicios;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        // Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        // calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        // (1SM=R$788,00)

        Scanner escanear = new Scanner(System.in);
        double salarioMinimo = 788.00;
        double salario;

        System.out.println("por favor, informe o valor do seu salario: ");
        salario = escanear.nextFloat();

        double resultado = salario/salarioMinimo;
        System.out.printf("a quantidade de salarios minimos que você recebe é: %.2f", resultado); // %.2f dois numeros apos a virgula
    }
}
