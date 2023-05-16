package exercicios_aleatorios;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00) */

import java.util.Scanner;

public class salarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do salário minimo: ");
        double SalarioMinimo = input.nextDouble();
        System.out.println("Digite seu salario: ");
        double Salario = input.nextDouble();
        double total = Salario / SalarioMinimo;
        System.out.println("Você Recebe " + total + " salarios");
        input.close();
    }
}
