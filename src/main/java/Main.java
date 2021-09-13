import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    private static final String API_FREECODE_URL= "https://api.freecodecamp.org/api/users/get-public-profile?username=yassscoder";
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_FREECODE_URL))
                .GET()
                .build();
        HttpResponse<String>response=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        //parse json into list? just take id?

        //tengo que comparar el campo id del json, pero me van a venir en el json varios campos id
    }
}
