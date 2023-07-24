package exercicios_1.evento_academico;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
        this.mostraEvento();
    }

    void mostraEvento(){
        System.out.println("Nome" + nomeDoEvento);
        System.out.println("Local" + localDoEvento);
        System.out.println("numero de participantes" + numeroDeParticipantes);
    }
}
