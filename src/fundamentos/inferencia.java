package fundamentos;

/* A inferencia se refere a não fazer a declaração de um tipo especifico
 * exemplo, ao invés de inicializar a variavel como int, se inicializa como var
 * e lhe atribui o valor 10, o java vai tratar essa variavel como int, e não
 * pode atribuir outro tipo de dado uma vez que float , boolean, string,
 * todos são diferentes de int, até pode inicializar como float e atribuir um int
 * lembrando que mesmo assim o int vai ser tratado como float
 * (adicionando o ponto após o número ex: 12 vira 12.0)
 */

public class inferencia {

    public static void main(String[] args) {
        var a = 12.5;
        System.out.println(a);
        a = 12;
        System.out.println(a);
    }
}
