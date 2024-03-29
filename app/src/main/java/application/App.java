package application;

import java.util.Calendar;
import java.util.ArrayList;

import application.model.AbstractAtividade;
import application.model.Compromisso;
import application.model.Tarefa;

public class App {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDetalhes());  

        Tarefa t2 = new Tarefa("Segunda Tarefa");
        System.out.println(t2.getDetalhes());

        Compromisso c = new Compromisso();
        c.setDescricao(" Periodo de Provas");
        Calendar dtInit = Calendar.getInstance();
        dtInit.set(2024, 3, 1);
        Calendar dtFim = Calendar.getInstance();
        dtFim.set(2024, 3, 8);

        c.setDataInicial(dtInit);
        c.setDataFinal(dtFim);

        System.out.println(c.getDetalhes());

        Compromisso c2 = new Compromisso();
        c2.setDescricao("Férias");
        c2.setDataInicial(1, 7, 2024);
        c2.setDataFinal(30, 7, 2024);

        System.out.println(c2.getDetalhes());

        ArrayList<AbstractAtividade> lista = new ArrayList<AbstractAtividade>();
        lista.add(t);
        lista.add(c2);

        System.out.println("----------[Lista]----------");
        for(AbstractAtividade a : lista) {
            System.out.println(a.getDetalhes());
        }

        for(int v : Compromisso.strDateToArrayIntDate("28/03/2024")) {
            System.out.println(v);
        }
    }
}