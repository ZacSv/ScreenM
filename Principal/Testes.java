package screenmatch.Principal;
import screenmatch.modelosGerais.Filme;
import screenmatch.modelosGerais.Serie;
import screenmatch.modelosGerais.Titulo;
import screenmatch.modelosGerais.Episodios;
import screenmatch.classesDeCalculo.FiltroRecomendacao;
import screenmatch.classesDeCalculo.Classificavel;
import screenmatch.classesDeCalculo.calculadoraDeTempo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Testes {
    

    public static void main(String[] args){

        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Isac");
        listaDeNomes.add("Karyne");
        listaDeNomes.add("Amanda");
        listaDeNomes.add("Jaqueline");
        for (String nome: listaDeNomes) {
            System.out.println(nome);
        }
        Collections.sort(listaDeNomes);
        for (String nome: listaDeNomes) {
            System.out.println(nome);
        }



    }
}
