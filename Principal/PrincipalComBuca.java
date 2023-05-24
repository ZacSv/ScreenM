package screenmatch.Principal;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmatch.modelosGerais.Titulo;
import screenmatch.modelosGerais.importOMDB;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBuca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leDados = new Scanner(System.in);
        System.out.println("Qual filme deseja buscar ? ");
        var pegaDados = leDados.nextLine();

        var endereco = "https://www.omdbapi.com/?t=" + pegaDados + "&apikey=7fec4bef";



        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        //Guardando o retorno da pesquisa na variavel "retornoJson"
        String retornoJson = response.body();


        //Criando um objeto da classe GsonBuilder para manipular o Json e definir a política de escrita dos atributos
        Gson transformaObjeto = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        importOMDB retornaJson = transformaObjeto.fromJson(retornoJson, importOMDB.class);
        System.out.println(retornaJson);

        Titulo recebeOmdb = new Titulo(retornaJson);
        System.out.println("TITULO CONVERTIDO");
        System.out.println(recebeOmdb);


    }
 }
