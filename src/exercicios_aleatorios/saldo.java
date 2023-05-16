package exercicios_aleatorios;

/* Informar um saldo e imprimir o saldo com reajuste de 1%.*/

import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Digite o saldo: ");
        int saldo = input.nextInt();
        double ajuste = saldo + (saldo / 100);
        System.out.println("O seu novo saldo é: R$" + ajuste);
        input.close();
    }
    
}
