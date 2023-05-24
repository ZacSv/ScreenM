package screenmatch.modelosGerais;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String      nome;
    @SerializedName("Year")
    private int         anoDeCriacao;
    private double      duracao;
    private double      avaliacao;


    public Titulo(String nome, int anoDeCriacao) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
    }

    //ATRIBUTOS DA CLASSE FILME
    public  void fichaTecnica(){
        System.out.println("O nome deste titulo é:  " + this.nome);
        System.out.println("O ano de lançamento deste título é: " + this.anoDeCriacao);
    }
    int soma; // VARIÁVEL QUE ARMAZENA AS NOTAS DADAS PELO USUÁRIO

    //METODO QUE PERMITE QUE O USUÁRIO AVALIE O FILME
    public void avalia(double nota){
        avaliacao += nota;
        soma++; //INCREMENTO REALIZADO PARA QUE SEJA POSSÍVEL SER FEITA A MÉDIA
    }
    //METODO QUE REALIZA O CÁLCULO PARA NOTA DE CORTE
    public double pegaMedia(){
        return avaliacao/soma;
    }


    //MÉTODO QUE RETORNA A QUANTIDADE TOTAL DE AVALIAÇÕES DADAS PARA O FILME
    public int somaAvaliacoes(){
        return soma;
    }


    //Declarando e retornando o tempo de duração dos titulos
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public double getDuracao(){
        return duracao;
    }


    //GETTERS E SETTERS

    //Declarando e retornando o nome do filme
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //Declarando e retornando o ano de criação do filme
    public int getAnoDeCriacao(){
        return anoDeCriacao;
    }
    public void setAnoDeCriacao(int anoDeCriacao){
        this.anoDeCriacao = anoDeCriacao;
    }

    //Método utilizado para comparar um objeto de título com o outro pelo campo nome mesmo sendo diferentes objetos.
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                '}';
    }
}