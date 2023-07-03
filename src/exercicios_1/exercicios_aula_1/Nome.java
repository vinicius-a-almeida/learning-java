package exercicios_1.exercicios_aula_1;

import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Bem vindo " + nome);
        input.close();
    }
}
