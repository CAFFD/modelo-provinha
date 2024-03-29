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

    public void setDataInicial(int dia, int mes, int ano){
        Calendar cal = Calendar.getInstance();
        cal.set(ano, (mes - 1), dia);
        this.setDataInicial(cal);

    }
    public void setDataFinal(int dia, int mes, int ano){
        Calendar cal = Calendar.getInstance();
        cal.set(ano, (mes - 1), dia);
        this.setDataFinal(cal);
    }

    public static int[] strDateToArrayIntDate(String data) {
        int[] resultado = new int[3];
        String[] strArray = data.split("\\s*/\\s*");
        for(int cont = 0;cont < strArray.length;cont++) {
            resultado[cont] = Integer.parseInt(strArray[cont]);
        }
        return resultado;
    }
    // vai converter uma String em um vetor de Inteiros.
    // split - vc passa um padrão e quebra a string no padrão.
}