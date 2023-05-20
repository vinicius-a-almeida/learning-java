package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; // conversão implicita
        // foi realizada a conversão do tipo int (1) para double (1.0)
        System.out.println(a);

        // o casting é bem semelhante com o casting em C
        float b = (float) 1.12345; // conversão explicita
        System.out.println(b);

        // lembrando que java não analisa valor e sim tipos
        int c = 4;
        byte d = (byte) c;
        System.out.println(d);
    }
}
