package abstrata_polimorfismo_iterface.Q_50;

public abstract class FiguraGeometrica {

    public class Desenho {
        private FiguraGeometrica fig1 , fig2;
        private double x, y;

        public Desenho (FiguraGeometrica fig1, FiguraGeometrica fig2, double x, double y){
        this.fig1 = fig1;
        this.fig2 = fig2;
        this.x = x;
        this.y = y;
        }

        public FiguraGeometrica getFig1() {
            return fig1;
        }

        public void setFig1(FiguraGeometrica fig1) {
            this.fig1 = fig1;
        }

        public FiguraGeometrica getFig2() {
            return fig2;
        }

        public void setFig2(FiguraGeometrica fig2) {
            this.fig2 = fig2;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void apresenta(){
            
        }

        
    }

    

    public abstract void desenha();

    }

    class Circulo extends FiguraGeometrica{
        @Override
        public void desenha(){
            System.out.println("Desenhando um circulo");
        }
    }

    class Quadrado extends FiguraGeometrica{
        @Override
        public void desenha(){
            System.out.println("Desenhando um quadrado");
        }
    }

    class Triangulo extends FiguraGeometrica{
        @Override
        public void desenha(){
            System.out.println("Desenhando um triangulo");
        }
    }