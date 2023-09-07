package arrays_arraysList.Q_38;

public class Demo {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(new EntradaEmAgenda(0, 1, 6, 2023, "Aniversario"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(0, 10, 9, 2005, "teste"));

        agenda.listaDia(1, 6, 2023);
    }
}
