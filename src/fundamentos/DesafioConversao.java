package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu primeiro salario: ");
        String salario1 = input.next().replace(",", ".");
        System.out.print("Digite o seu segundo salario: ");
        String salario2 = input.next().replace(",", ".");
        System.out.print("Digite seu terceiro salario: ");
        String salario3 = input.next().replace(",", ".");

        System.out.println("A soma dos 3 salarios é: " + (Double.parseDouble(salario1) + 
        Double.parseDouble(salario2) + Double.parseDouble(salario3)));
        System.out.println("A média dos 3 salarios é: " + (Double.parseDouble(salario1) + 
        Double.parseDouble(salario2) + Double.parseDouble(salario3)) / 3);
        input.close();
    }
}
