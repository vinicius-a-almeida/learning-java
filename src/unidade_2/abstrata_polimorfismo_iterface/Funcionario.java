package abstrata_polimorfismo_iterface;

public class Funcionario {
    private String nome;
    private float salario;
    private float horas;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salario = 2.0F;
    }

    public Funcionario (String nome, float horas){
        this.nome = nome;
        this.horas = horas;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    
}
