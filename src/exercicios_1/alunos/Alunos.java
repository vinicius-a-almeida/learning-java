package exercicios_1.alunos;

public class Alunos {
    private String matricula, nome;
    private double nota1, nota2, trabalho;

    Alunos(String matricula, String nome, double nota1, double nota2, double trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public double getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(int trabalho) {
        this.trabalho = trabalho;
    }

    double media(){
        return (((nota1 + nota2) * 5) + (trabalho * 2)) / 3;
    }

    double vaiParaFinal(double media){
        if(media >= 7.0){
            System.out.println("Parabéns, passou por média :D\n");
            return 0.0;
        }else{
            double precisa = 7.0 - media;
            return precisa;
        }
    }
}
