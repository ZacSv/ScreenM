package screenmatch.modelosGerais;

//CLASSE CRIADA PARA PERSONALIZAÇÃO DOS EPISÓDIOS

public class Episodios {
    private int numero;
    private String nome;
    private Serie serie;



    //GETTERS E SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


}
