package fundamentos;
import java.util.Scanner;

// atividade convertendo fahrenheit para celsius

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int i = 32;
        final double j = 5 / 9.0;
        System.out.println("Digite a temperatura em fahrenheit: ");
        double f = input.nextInt();
        System.out.println("O resultado da conversão é: " + (f - i) * j + " Cº");
        input.close();
    }
}
