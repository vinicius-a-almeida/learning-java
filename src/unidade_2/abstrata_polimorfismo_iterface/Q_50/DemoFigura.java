package abstrata_polimorfismo_iterface.Q_50;

public class DemoFigura {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();

        circulo.desenha();
        quadrado.desenha();
        triangulo.desenha();
    }
}
