package exercicios_1.exercicios_aula_1;

import java.util.Scanner;

public class FatorialRecursiva {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num = input.nextInt();
        System.out.printf("O fatorial de %d é: %d\n", num, fat(num));

        input.close();
    }

    public static int fat(int n){
        if(n == 0){
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }
}
