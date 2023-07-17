package exercicios_1.lista_1;

import java.util.Scanner;

public class menor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = input.nextInt();
        if (num1 > num2 && num2 > num3 && num1 > num2){
            System.out.println("O maior número é: " + num1);
        }
        input.close();
    }
}
