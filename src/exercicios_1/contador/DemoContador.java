package exercicios_1.contador;

import java.util.Scanner;

public class DemoContador {
    public static void main(String[] args) {
        Contador cont = new Contador(0);
        Scanner input = new Scanner(System.in);


        System.out.println("digite 1 para zerar, 2 incrementar e 3 para imprimir: ");
        int escolha = input.nextInt();

        if(escolha == 1){
            cont.zera();    
        }
        else if(escolha == 2){
            cont.incremento();    
        } else if(escolha == 3){
            cont.imprime();    
        }

        
        input.close();
    }


}
