package fundamentos;

/*Uma classe empacotadora, em inglês wrapper class,
na linguagem de programação Java é uma das oito classes
fornecidas no pacote java.lang para fornecer métodos de
objeto para os oito tipos primitivos.
Todas as classes wrapper em Java são imutáveis. */

/*Os Wrapper são conhecidos na linguagem Java como
classes especiais que possuem métodos capazes de fazer
conversões em variáveis primitivas e também de encapsular
tipos primitivos para serem trabalhados como objetos, ou seja,
é feita um embrulho de streams que são fluxo de dados através de canais.

Sendo assim, existe uma classe Wrapper para cada tipo primitivo
identificado pelo mesmo nome do tipo que possui e tendo a primeira
letra maiúscula. Essa regra de declaração é aplicada a todos os tipos,
exceto aos que sãochar classificados como Character e boolean como Boolean.  */

public class Wrapper {
    public static void main(String[] args) {
        // byte
        Byte b = 100;
        Short s = 1000; 
        Integer i = Integer.parseInt("10000"); //int
        Long l = 100000L;
        Character c = '#';
        Float f = 123.0F;
        Double d = 1234.5678;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(l);
        System.out.println(c + "...");
        System.out.println(f);
        System.out.println(d);
    }
}


//http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx