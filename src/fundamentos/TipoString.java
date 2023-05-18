package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        double dinheiro = 1100.00;
        String nome = "José Silveira";
        System.out.printf("O senhor %s recebe %.2f\n", nome, dinheiro);
    }
}
