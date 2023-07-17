package exercicios_1.exercicios_aula_1;


public class Distancia {
    public static void main(String[] args) {
        float kmh = 0.0F;
        double ms = 0.0;
        double mph = 0.0;
        while(kmh < 50.0F){
            kmh += 0.5;
            ms = kmh * 0.2778;
            mph = 0.6214 * kmh;
            System.out.printf("Km/h: %.2f\tm/s: %.2g\t\tmph: %.2g\n", kmh, ms, mph);
            
        }
        
    }
}
