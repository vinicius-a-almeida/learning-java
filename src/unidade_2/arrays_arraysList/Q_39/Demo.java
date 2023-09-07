package arrays_arraysList.Q_39;

public class Demo {

   

    public static void main(String[] args) {
        float [][]num = {{2.0F, 4.0F}, {6.0F, 8.0F}};
        Matriz matriz = new Matriz(num);  
        
        matriz.impressao(num);
        System.out.println("A determinante da matriz é: " + matriz.determinante(num));
    }
}
