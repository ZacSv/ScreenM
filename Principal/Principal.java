package screenmatch.Principal;
import screenmatch.modelosGerais.Filme;
import screenmatch.modelosGerais.Serie;
import screenmatch.modelosGerais.Titulo;
import screenmatch.modelosGerais.Episodios;
import screenmatch.classesDeCalculo.FiltroRecomendacao;
import screenmatch.classesDeCalculo.Classificavel;
import screenmatch.classesDeCalculo.calculadoraDeTempo;

import java.lang.reflect.Array;
import java.util.*;


//CLASSE PARA TESTAR AS FUNCIONALIDADES E ATRIBUIÇÕES


public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme("Cães de Guerra", 2017);
        Filme outroFilme = new Filme("Homem Aranha", 2022);
        Filme terceiroFilme = new Filme("Vingadores - Ultimato", 2020);

        Serie primeiraSerie = new Serie("Lost", 2001);
        Serie segundaSerie = new Serie("La Casa de Papel", 2018);
        Serie terceiraSerie = new Serie("Breaking Bad", 2016);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(primeiroFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(terceiroFilme);
        listaDeAssistidos.add(primeiraSerie);
        listaDeAssistidos.add(segundaSerie);
        listaDeAssistidos.add(terceiraSerie);

        listaDeAssistidos.sort(Comparator.comparing(Titulo :: getNome));

        for (Titulo titulo: listaDeAssistidos) {
            System.out.println(titulo);
        }

    }
}
