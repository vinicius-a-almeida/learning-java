package arrays_arraysList.Q_40;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Cliente> clientes = new ArrayList<>();

        
        int id;
        String nome, telefone, idade;

        while (true){
            System.out.println("Digite o ID do cliente: ");
            id = input.nextInt();
            if (id < 0){
                break;
            }

            input.nextLine();

            System.out.println("Digite o nome do cliente: ");
            nome = input.nextLine();

            System.out.println("Digite a idade do cliente: ");
            idade = input.nextLine();

            System.out.println("Digite o telefone do cliente: ");
            telefone = input.nextLine();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);

        }
        for (Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }

        input.close();
        
    }
}