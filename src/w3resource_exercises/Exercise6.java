package w3resource_exercises;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.printf("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.printf("%d + %d = %d\n",num1, num2,  num1 + num2);
        System.out.printf("%d - %d = %d\n",num1, num2,  num1 - num2);
        System.out.printf("%d x %d = %d\n",num1, num2,  num1 * num2);
        System.out.printf("%d / %d = %d\n",num1, num2,  num1 / num2);
        System.out.printf("%d mod %d = %d\n",num1, num2,  num1 % num2);
        input.close();
    }
}
