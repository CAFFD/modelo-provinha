package application.model;

import java.util.Calendar;

public class Compromisso extends AbstractAtividade{
    private Calendar dataInicial;
    private Calendar dataFinal;

    public void setDataInicial(Calendar dataInicial){
        this.dataInicial = dataInicial;
    }
    public Calendar getDataInicial() {
        return this.dataInicial;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
    public Calendar getDataFinal() {
        return this.dataFinal;
    }

    @Override
    public String getDetalhes() {
        return "[C]" + this.getDescricao() +
        " :: " + this.getDataInicial().getTime() +
        " :: " + this.getDataFinal().getTime();
    }
}