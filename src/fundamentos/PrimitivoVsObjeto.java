package fundamentos;

public class PrimitivoVsObjeto {
    
    //Um tipo primitivo como int não tem notação ponto, enquanto que um objeto
    //como uma string tem comportamentos associados como o .toUpperCase()
    public static void main(String[] args) {
    String s = new String("texto");
    s.toUpperCase();

    // Wrappers são a versão objeto dos tipos primitivos
    int a = 123;
    System.out.println(a);

    }
}
