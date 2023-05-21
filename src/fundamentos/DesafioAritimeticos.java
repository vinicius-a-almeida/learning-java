package fundamentos;

public class DesafioAritimeticos {
    public static void main(String[] args) {
         double a = Math.pow(6 * (3+2), 2) / (3 * 2);
         double b = Math.pow((1 - 5) * (2 - 7), 2) / 2;
         double res = Math.pow(b - a, 3) / Math.pow(10, 3);
         System.out.println(res);
    }
}
