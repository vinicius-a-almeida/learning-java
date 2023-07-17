package exercicios_1.lista_1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Float n1 = input.nextFloat();
        System.out.println("Digite o segundo número: ");
        Float n2 = input.nextFloat();
        System.out.println("Digite o terceiro número: ");
        Float n3 = input.nextFloat();
        System.out.printf("A soma dos números é: %.2f\n", n1 + n2 + n3);
        System.out.printf("A média dos números é: %.2f\n", (n1 + n2 + n3) / 3);
        input.close();
    }
}
