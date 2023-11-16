package exercicios;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        // Escrever um algoritmo que lê:
        //- a porcentagem do IPI a ser acrescido no valor das peças
        //- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        //- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        //O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
        //Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

        Scanner escanear = new Scanner(System.in);

        System.out.println("porcentagem a ser acrescido, por favor não coloque %");
        float IPI = escanear.nextFloat();

        System.out.println("codigo da peça 1?");
        float codigo1 = escanear.nextFloat();

        System.out.println("valor da peça 1");
        float valor1 = escanear.nextFloat();

        System.out.println("digite quantidade da peça 1");
        int qtd1 = escanear.nextInt();

        System.out.println("codigo da peça 2?");
        float codigo2 = escanear.nextFloat();

        System.out.println("valor da peça 2");
        float valor2 = escanear.nextFloat();

        System.out.println("digite quantidade da peça 2");
        int qtd2 = escanear.nextInt();

        float resultado = (valor1*qtd1 + valor2*qtd2)*(IPI/100 + 1);
        System.out.printf("o resultado é %.2f", resultado);
    }
}
