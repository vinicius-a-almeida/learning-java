package exercicios_1;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o valor do lado do quadrado: ");
        int lado = input.nextInt();
        System.out.printf("A area do quadrado é: %d\n", lado * lado);
        input.close();

    }
}
