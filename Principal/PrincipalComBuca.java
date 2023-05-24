package screenmatch.Principal;
import com.google.gson.Gson;
import screenmatch.modelosGerais.Titulo;

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


        //Criando um objeto da classe Gson para manipular o Json
        Gson transformaObjeto = new Gson();

        Titulo retornaJson = transformaObjeto.fromJson(retornoJson, Titulo.class);
        System.out.println(retornaJson);
    }
 }
