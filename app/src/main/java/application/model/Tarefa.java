package application.model;

public class Tarefa extends AbstractAtividade {
    private boolean concluido;

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean getConcluido() {
        return this.concluido;
    }
    public Tarefa(String descricao, boolean concluido) {
        this.setDescricao(descricao);
        this.setConcluido(concluido);
    }
    public Tarefa() {}
    public Tarefa(String descricao) {
        this.setDescricao(descricao);
        this.setConcluido(false);
    }

    @Override
    public String getDetalhes() {
        return "[T] " + this.getDescricao();
    }
}