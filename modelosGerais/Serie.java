package screenmatch.modelosGerais;

import screenmatch.classesDeCalculo.Classificavel;

//CLASSE CRIADA PARA PERSONALIZAÇÃO DAS SÉRIES

public class Serie extends Titulo implements Classificavel {

    //ATRIBUTOS ESPECÍFICOS DA SUBCLASSE SÉRIE
    private int temporadas;
    private boolean continuidade;
    private int episodios;
    private double minutosPorEpisodio;

    public Serie(String nome, int anoDeCriacao) {
        super(nome, anoDeCriacao);
    }


    //GETTERS E SETTERS DOS MÓDULOS DE SÉRIE
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean getContinuidade() {
        return continuidade;
    }

    public void setContinuidade(boolean continuidade) {
        this.continuidade = continuidade;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public double getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(double minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    @Override
    public int getEstrelas() {
        return 0;
    }


    public String toString(){
        return "Serie: " + this.getNome() + " " + this.getAnoDeCriacao();
    }
}