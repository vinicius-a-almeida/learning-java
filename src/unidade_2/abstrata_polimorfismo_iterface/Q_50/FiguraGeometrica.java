package abstrata_polimorfismo_iterface.Q_50;

public abstract class FiguraGeometrica {
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