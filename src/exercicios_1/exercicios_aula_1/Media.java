package exercicios_1.exercicios_aula_1;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = input.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        n3 = input.nextDouble();
        System.out.printf("A média é: %f", media(n1, n2, n3));
        input.close();
    }
    public static double media(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }
}
