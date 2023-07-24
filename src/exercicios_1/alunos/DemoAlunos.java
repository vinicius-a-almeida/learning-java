package exercicios_1.alunos;

import java.util.Scanner;

public class DemoAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite a matricula: ");
        String matricula = input.nextLine();  
        System.out.println("Digite o nome: ");
        String nome = input.nextLine(); 
        System.out.println("Digite a primeira nota: ");
        Double nota1 = input.nextDouble(); 
        System.out.println("Digite a segunda nota: ");
        Double nota2 = input.nextDouble(); 
        System.out.println("Digite a nota do trabalho: ");
        Double trabalho = input.nextDouble(); 

        Alunos aluno1 = new Alunos(matricula, nome, nota1, nota2, trabalho);

        double media = aluno1.media();
        double precisa = aluno1.vaiParaFinal(media);
        if(precisa != 0.0){
            System.out.println("Infelizmente você precisa de : " + precisa);
        }
        
        input.close();
    }
}
