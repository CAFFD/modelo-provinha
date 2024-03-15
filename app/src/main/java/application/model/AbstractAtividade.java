package application.model;

public abstract class AbstractAtividade implements Atividade {
    private String descricao;
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
}