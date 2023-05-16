package exercicios_aleatorios;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor. */

import java.util.Scanner;

public class AntecessorSucessor {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        int ant = num - 1;
        int sucessor = num + 1;
        System.out.println("o antecessor de " + num + " é " + ant + " e o sucessor é " + sucessor);
        input.close();  
    }

}
