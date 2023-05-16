package exercicios_aleatorios;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias. */

public class Media {
    public static void main(String[] args) {
        int media_1 = (8 + 9 + 7) / 3;
        int media_2 = (4 + 5 + 6) / 3;
        System.out.println("A média entre 8, 9 e 7 é: " + media_1);
        System.out.println("A média entre 4, 5 e 6 é: " + media_2);
        int soma = media_1 + media_2;
        System.out.println("A soma das duas médias é: " + soma);


    }
}
