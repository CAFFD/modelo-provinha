package application;

import application.model.Tarefa;

public class App {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDescricao());  

        Tarefa t2 = new Tarefa("Segunda Tarefa");
        System.out.println(t2.getDescricao());
    }
}