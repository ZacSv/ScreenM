package screenmatch.classesDeCalculo;

import screenmatch.modelosGerais.Titulo;

/*CALCULADORA QUE FUNCIONA RECEBENDO DO USUÁRIO UMA LISTA DE FILMES E SÉRIES
E COM BASE NISSO CALCULA O TEMPO QUE O USUÁRIO LEVARIA PARA ASSISTIR TODOS OS ESCOLHIDOS*/


public class calculadoraDeTempo {
    private int tempoDemandado;

    public int getTempoDemandado(){
        return  tempoDemandado;
    }
    public void inclui (Titulo t){

        this.tempoDemandado += t.getDuracao();

    }
}
