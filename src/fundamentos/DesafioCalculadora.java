package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Digite o primeiro número: ");
            double num1 = input.nextDouble();
            System.out.println("Digite o segundo número: ");
            double num2 = input.nextDouble();
            System.out.println("Digite qual operação deseja fazer, +, -, *, / ou %: ");
            String op = input.next();
            if (op.equals("+")) {
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
            }
            else if(op.equals("-")){
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
            }
            else if(op.equals("*")){
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
            }
            else if(op.equals("/")){
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
            else if(op.equals("%")){
                System.out.printf("%f %% %f = %f", num1, num2, num1 % num2);
            }
            else{
                System.out.println("ERROR");
            }
            System.out.println("\nDeseja fazer outra operação? S / N");
            op = input.next().replace("n", "N");
            if (op.equals("N")){
                break;
            }
        }
        input.close();
    }

}
