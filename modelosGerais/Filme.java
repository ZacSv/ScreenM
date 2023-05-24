package screenmatch.modelosGerais;

import screenmatch.classesDeCalculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoDeCriacao) {
        super(nome, anoDeCriacao);
    }

    @Override
    public int getEstrelas() {
        return (int) pegaMedia() / 2;
    }

    //Sobrescrita do método toString com função de retornar os nomes dentro de um arrayList com uma declaração simples
    public String toString() {
        return "Filme: " + this.getNome() + " " + this.getAnoDeCriacao();
    }

    //Contrutor que permite a escrita do nome do filme diretamente na criação do objeto.
}