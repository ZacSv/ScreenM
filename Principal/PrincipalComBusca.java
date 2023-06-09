package screenmatch.Principal;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.modelosGerais.Titulo;
import screenmatch.modelosGerais.importOMDB;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//CLASSE DE BUSCA DOS FILMES E SÉRIES UTILIZANDO UMA API

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner leDados = new Scanner(System.in);
        String pegaDados = "";
        List<Titulo> titulosPesquisados = new ArrayList<>();

        //Criando um objeto da classe GsonBuilder para manipular o Json e definir a política de escrita dos atributos
        Gson transformaObjeto = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (!pegaDados.equalsIgnoreCase("sair")) {

            //GUARDANDO O NOME DO FILME A SER PESQUISADO
            System.out.println("Qual filme deseja buscar ? ");
            pegaDados = leDados.nextLine();

            if(pegaDados.equalsIgnoreCase("sair")){
                break;
            }


            //CRIANDO A URL DE PESQUISA
            var endereco = "https://www.omdbapi.com/?t=" + pegaDados.replace(" ", "+") + "&apikey=7fec4bef";

            //UTILIZANDO A URL CRIADA PARA CRIAR UMA REQUEST E CONSULTAR A API
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //Guardando o retorno da pesquisa na variavel "retornoJson"
            String retornoJson = response.body();

            importOMDB retornaJson = transformaObjeto.fromJson(retornoJson, importOMDB.class);

            //"TRANSFORMANDO" UM TIPO JSON EM UM TIPO "TÍTULO"
            Titulo recebeOmdb = new Titulo(retornaJson);
            System.out.println("TITULO CONVERTIDO");
            System.out.println(recebeOmdb);

            titulosPesquisados.add(recebeOmdb);
            FileWriter filmesPesquisados = new FileWriter("Filmes Pesquisados.json");
            filmesPesquisados.write(transformaObjeto.toJson(recebeOmdb));
            filmesPesquisados.close();


        }

        System.out.println(titulosPesquisados);
    }
 }
