package exercicios_aleatorios;

import java.util.Scanner;

/* Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/


public class ValorPago {
    //foi usado o @SuppressWarnings pois ele estava
    //reclamando que tinha variaveis que não estão sendo usadas
    @SuppressWarnings("all")
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a porcentagem do IPI a ser acrescido: ");
        int ipi = input.nextInt();
        System.out.println("Digite o código da peça 1: ");
        int peca1 = input.nextInt();
        System.out.println("digite o valor da peça 1: ");
        int valor1 = input.nextInt();
        System.out.println("Digite a quantidade e peças 1: ");
        int quant1 = input.nextInt();
        System.out.println("Digite o código da peça 2: ");
        int peca2 = input.nextInt();
        System.out.println("digite o valor da peça 2: ");
        int valor2 = input.nextInt();
        System.out.println("Digite a quantidade e peças 2: ");
        int quant2 = input.nextInt();
        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
        System.out.println("O valor total é de: " + total);  
    }   
}
