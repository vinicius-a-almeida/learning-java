package exercicios_1.elevador;

import java.util.Scanner;

public class DemoElevador {
    public static void main(String[] args) {
        // Criando o scanner, para fazer a leitura do teclado
        Scanner input = new Scanner(System.in);

        // intanciando a classe elevador
        Elevador elevador = new Elevador(0, 0, 0, 0);
        int escolha;

        //pedindo a quantidade de andares que tem no prédio
        System.out.println("Digite a quantidade de andares que tem no prédio");
        elevador.setTotalAndares(input.nextInt());
        System.out.println("Digite a capacidade de pessoas no elevador");
        elevador.setCapacidade(input.nextInt());


        // do while para que o usuario possa encerrar a aplicação no momento que quiser
        do{
        System.out.println("Digite 1 caso queira subir um andar ou 0 caso queira descer, 2 para entrar e 3 para sair: \n");
        System.out.println("Digite -1 para sair: ");
        escolha = input.nextInt();


        if(escolha == 1){
            elevador.sobe();
            
        }else if(escolha == 0){
            elevador.desce();
        }
        if(escolha == 2){
            elevador.entra();
            
        }else if(escolha == 3){
            elevador.sair();
        }
        }while(escolha != -1);
        
        input.close();
    }
}
