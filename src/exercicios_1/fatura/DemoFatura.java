package exercicios_1.fatura;

import java.util.Scanner;

public class DemoFatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o codigo de identificação do produto: ");
        String numIdentifica = input.nextLine();
        System.out.print("Digite a descrição do produto: ");
        String descricao = input.nextLine();
        System.out.print("Digite a quantidade comprada do produto: ");
        int quantidade = input.nextInt();
        System.out.print("Digite o preço da unidade do produto: ");
        double precoUnitario = input.nextDouble();

        Fatura fatura1 = new Fatura(numIdentifica, descricao, quantidade, precoUnitario);
        fatura1.mostra();
        input.close();

    }
}
