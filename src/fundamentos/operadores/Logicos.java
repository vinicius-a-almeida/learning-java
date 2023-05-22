package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        // Tabela verdade E
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true); // dead code pois false implica que
        // automaticamente tudo é false sem necessariamente checar a outra
        //condição
    }
}
