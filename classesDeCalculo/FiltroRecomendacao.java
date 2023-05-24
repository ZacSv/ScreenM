package screenmatch.classesDeCalculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){

        if (classificavel.getEstrelas() >= 4){
            System.out.println("O filme faz parte dos queridinhos no momento ! Sua avaliação é: " + classificavel.getEstrelas());
        }else if (classificavel.getEstrelas() >= 2 && (classificavel.getEstrelas() < 4)){

            System.out.println("O filme pode ser uma boa opção sua avaliação é: " + classificavel.getEstrelas());
        }else {
            System.out.println("Talvez este filme não seja a melhor opção no momento, sua avaliação é: " + classificavel.getEstrelas());
        }


    }
}
