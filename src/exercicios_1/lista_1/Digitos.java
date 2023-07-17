package exercicios_1.lista_1;

import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 3 digitos: ");
        String teste = input.next();
        // char num1 = input.next().charAt(0);
        // char num2 = input.next().charAt(1);
        // char num3 = input.next().charAt(2);
        char num1 = teste.charAt(0);
        char num2 = teste.charAt(1);
        char num3 = teste.charAt(2);
        System.out.printf("%c%c%c", num3, num1, num2);
        input.close();
    }
}
