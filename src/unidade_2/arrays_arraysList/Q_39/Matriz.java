package arrays_arraysList.Q_39;

public class Matriz {
    private float [][]matriz = new float[2][2];


    public Matriz(float[][] matriz) {
        this.matriz = matriz;
    }


    public float[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(float[][] matriz) {
        this.matriz = matriz;
    }


    public void impressao(float[][] matriz){
        for (int i = 0; i <= 1; i++){
            for (int j = 0; j <= 1; j++){
                System.out.printf("%.1f\t", matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

    public double determinante(float[][] matriz){
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }
    
}
