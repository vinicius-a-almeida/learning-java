package fundamentos;

public class AreaCircuferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.1415;
        double area = pi * raio * raio;
        System.out.println(area);
        raio = 10;
        area = pi * raio * raio;
        System.out.println("A area é: " + area);
    }
}
