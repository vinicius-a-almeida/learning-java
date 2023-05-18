package w3resource_exercises;

import java.util.Scanner;

/*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.printf("Digite o segundo número: ");
        int num2 = input.nextInt();
        int solve = num1 * num2;
        System.out.printf("%d x %d = %d\n", num1, num2, solve);
        input.close();
    }
}
