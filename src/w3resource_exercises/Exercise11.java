package w3resource_exercises;

import java.util.Scanner;

/*Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double r = input.nextDouble();
        final double pi = 3.1415;
        System.out.println("O perimetro é: " + (2 * pi * r));
        System.out.println("O raio é: " + (pi * (r * r)));
        input.close();
    }
}
