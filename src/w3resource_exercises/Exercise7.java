package w3resource_exercises;

import java.util.Scanner;

/*Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int num1 = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", num1, i, num1 * i);
        }
        input.close();
    }
}
