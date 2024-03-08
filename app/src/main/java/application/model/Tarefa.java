package application.model;

public class Tarefa extends AbstractAtividade {
    private boolean concluido;

    public void setConcluido(boolean) {
        this.concluido = concluido;
    }

    public boolean getConcluido() {
        return this.concluido;
    }
}