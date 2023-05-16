package exercicios_aleatorios;
/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */
import java.util.Scanner; 

public class AnosDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos anos você tem: ");
        int anos = input.nextInt();
        System.out.println("Digite quantos meses: ");
        int meses = input.nextInt();
        System.out.println("Digite quantos dias: ");
        int dias = input.nextInt();
        int q_dias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Você tem " + q_dias);
        input.close();
    }
}

// 365000