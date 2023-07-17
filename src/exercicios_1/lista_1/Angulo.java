package exercicios_1.lista_1;

import java.util.Scanner;

public class Angulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ângulo em graus");
        double ang = input.nextDouble();
        // System.out.printf("O radiano de %g é %g\n", ang * Math.PI / 180);
        System.out.printf("O radiano de %.2g é %.2g\n", ang, Math.toRadians(ang));
        System.out.printf("O cosseno de %.2g é %.2g\n", ang, Math.cos(ang));
        System.out.printf("A tangente de %.2g é %.2g\n", ang, Math.tan(ang));
        System.out.printf("O seno de %.2g é %.2g\n", ang, Math.sin(ang));
        System.out.printf("O cossecante de %.2g é %.2g\n", ang, 1 / Math.sin(ang));
        System.out.printf("O secante de %.2g é %.2g\n", ang, 1 / Math.cos(ang));
        System.out.printf("O cotangente de %.2g é %.2g\n", ang, 1 / Math.tan(ang));
        input.close();
    }
}
