package exercicios_1.exercicios_aula_1;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = input.nextInt();
        System.out.println("Digite o mês: ");
        int mes = input.nextInt();
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();
        String saida = dia + " de ";

        if (mes == 1){
            saida += "janeiro";
        }else if (mes == 2){
            saida += "fevereiro";
        }else if (mes == 3){
            saida += "março";
        }else if (mes == 4){
            saida += "abril";
        }else if (mes == 5){
            saida += "maio";
        }else if (mes == 6){
            saida += "junho";
        }else if (mes == 7){
            saida += "julho";
        }else if (mes == 8){
            saida += "agosto";
        }else if (mes == 9){
            saida += "setembro";
        }else if (mes == 10){
            saida += "outubro";
        }else if (mes == 11){
            saida += "novembro";
        }else if (mes == 12){
            saida += "dezembro";
        }else{
            saida += "ERROR";
        }

        switch (mes) {
            case 1:
                System.out.println("Mês tem 31 dias");
                break;
            case 2:
                System.out.println("Mês tem 28 dias");
                break;
            case 3:
                System.out.println("Mês tem 31 dias");
            default:
                break;
        }

        saida += " de " + ano;
        System.out.println(saida);
        input.close();
    }
}
