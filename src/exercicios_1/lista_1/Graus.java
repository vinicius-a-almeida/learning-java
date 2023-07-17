package exercicios_1.lista_1;

import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos graus celsius: ");
        double cent = input.nextDouble();
        System.out.printf("A temperatura em graus fahrenheit é: %.2g\n", (cent * 9/5) + 32);
        input.close();
    }
}
