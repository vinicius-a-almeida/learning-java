package exercicios_1.exercicios_aula_1;

import java.util.Scanner;
import java.util.Calendar;

@SuppressWarnings("all")

public class Cartao {
    public static void main(String[] args) {
        String nome;
        Calendar calendario = Calendar.getInstance();
        int mes = 0, ano = 0, cvv = 0, mesAtual, anoAtual;
        mesAtual = 1 + calendario.get(Calendar.MONTH);
        anoAtual = 1 + calendario.get(Calendar.YEAR);
        
        Scanner input = new Scanner(System.in);
        boolean invalid;

        do{
            System.out.println("Digite o mes: ");
            mes = input.nextInt();
            System.out.println("Digite o ano: ");
            ano = input.nextInt();
            invalid = (ano < anoAtual) || (ano == anoAtual && mes < mesAtual);
        }while(invalid);
        
        System.out.println("Digite o cvv: ");
        cvv = input.nextInt();
        System.out.println("Digite o nome: ");
        nome = input.nextLine();

        input.close();
    }
}
