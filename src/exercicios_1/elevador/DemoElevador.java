package exercicios_1.elevador;

import java.util.Scanner;

public class DemoElevador {
    public static void main(String[] args) {
        // Criando o scanner, para fazer a leitura do teclado
        Scanner input = new Scanner(System.in);

        // intanciando a classe elevador
        Elevador elevador = new Elevador(0, 0, 0, 0);
        int andar = elevador.andar, escolha;
        //pedindo a quantidade de andares que tem no prédio
        System.out.println("Digite a quantidade de andares que tem no prédio");
        elevador.totalAndares = input.nextInt();


        // do while para que o usuario possa encerrar a aplicação no momento que quiser
        do{
        System.out.println("Digite 1 caso queira subir um andar ou 0 caso queira descer: \n");
        System.out.println("Digite -1 para sair: ");
        escolha = input.nextInt();
        if(escolha == 1){
            andar = elevador.sobe();
            if(andar == -1){
                System.out.println("Você já está no ultimo andar!");
            }else{
                System.out.println("você está no andar: " + andar);    
            }
            
        }else if(escolha == 0){
            andar = elevador.desce();
            if(andar == -1){
                System.out.println("Você já está no terreo!");
            }else{
                System.out.println("você está no andar: " + andar);    
            }
        }
        }while(escolha != -1);
        input.close();
    }
}
