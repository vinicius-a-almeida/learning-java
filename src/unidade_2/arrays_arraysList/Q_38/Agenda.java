package arrays_arraysList.Q_38;

import java.util.ArrayList;

public class Agenda {
    private ArrayList <EntradaEmAgenda> compromisso; 

    public Agenda() {
        this.compromisso = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda entrada){
        compromisso.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano){
        System.out.printf("\n\nCompromissos para %d/%d/%d", dia, mes, ano);
        for (EntradaEmAgenda entrada : compromisso){
            if(entrada.ehNoDia(dia, mes, ano)){
                System.out.println(entrada.toString());
            }
        }
    }
}
