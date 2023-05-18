package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos numéricos inteiros:


        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56889;
        //quando passa do range do int tem que fazer o L
        long pontosAcumulados = 3_234_845_223L; 

        // Tipos numéricos reais
        
        // para declarar float tem que ir de F
        //java não analisa o número e sim o tipo
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01; 

        // Tipo boolean

        boolean estaDeFerias = true;

        // Tipo caractere
        
        //Tipo caractere só aceita uma unica letra e em aspas simples
        char status = '\u0010'; //exemplo usando a tabela unicode e o codigo dela

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // número de viagens

        System.out.println(numerosDeVoos / 2);

        //pontos por real

        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println(id + ": está de ferias: " + estaDeFerias);

        System.out.println("Status: " + status);  
    }
}
