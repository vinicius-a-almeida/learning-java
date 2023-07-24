package exercicios_1.exercicios_aula_1;

import java.util.Scanner;

@SuppressWarnings("all")

public class Fatorial {
    
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in); 
        int fat = 0;
        System.out.println("Digite o número: ");
        num = input.nextInt();   
        for(int n = 0; n <= num; n++){
            fat = 1;
            for (int i=2; i <= n; i++){
                fat *= i;
            }
            System.out.printf("Fatorial de n %f ", n);
        }
        input.close();
    }
}
