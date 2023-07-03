package exercicios_1.exercicios_aula_1;

import java.util.Scanner;

public class Distancias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   
        System.out.print("Digite a distancia x1: ");
        double x1 = input.nextDouble();
        System.out.print("Digite a distancia y1: ");
        double y1 = input.nextDouble();
        System.out.print("Digite a distancia x2: ");
        double x2 = input.nextDouble();
        System.out.print("Digite a distancia y2: ");
        double y2 = input.nextDouble();
        System.out.printf("A distância é: %g\n", Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y1-y2, 2)));

        input.close();
    }
    
    
}
