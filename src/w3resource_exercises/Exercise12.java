package w3resource_exercises;

import java.util.Scanner;

/*Write a Java program that takes three numbers as input to calculate and print
the average of the numbers. */

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.printf("Digite o segundo número: ");
        double num2 = input.nextDouble();
        System.out.printf("Digite o terceiro número: ");
        double num3 = input.nextDouble();
        System.out.printf("A média entre %f, %f e %f é %f", num1, num2, num3, (num1 + num2 + num3) / 3);
        input.close();
    }
}
