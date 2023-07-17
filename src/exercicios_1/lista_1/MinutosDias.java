package exercicios_1.lista_1;

import java.util.Scanner;

public class MinutosDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    
        System.out.println("Digite os minutos: ");
        double min = input.nextDouble();
        final double dia = 1440, hora = 60;
        double res = dia / min;
        res -= dia / hora;
        System.out.printf("Dias: %g\t Horas\t min:%g", res, );
    }
    
    
}
