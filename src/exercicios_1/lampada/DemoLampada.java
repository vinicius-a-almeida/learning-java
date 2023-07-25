package exercicios_1.lampada;

import java.util.Scanner;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada(false);
        int escolha = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite 1 para acender, 0 para apagar -1 para sair e 3 para ver a quantidade de acendidas e apagadas");
            escolha = input.nextInt();


            if(escolha == 1){
                lamp.acende();   
            }else if(escolha == 0){
                lamp.apaga();
            }else if(escolha == 3){
                lamp.quantidadeAcesa();
            }
            
        } while (escolha != -1);
        

        input.close();
    }
}
